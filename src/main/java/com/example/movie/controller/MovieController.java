package com.example.movie.controller;

import com.example.movie.model.Movie;
import com.example.movie.model.MovieTheater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/movies")
    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Singam","Action","Tamil"));
        movies.add(new Movie("Singam2","Action","Tamil"));
        movies.add(new Movie("Singam3","Action","Tamil"));
        movies.parallelStream().forEach(this::accept);
        return movies;
    }

    private void accept(Movie movie) {
        movie.setTheaters((List<MovieTheater>) restTemplate.getForObject("http://movie-theater/theater/" + movie.getMovieName(), List.class));
    }

    /**
     * LoadBalanced for the client
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
