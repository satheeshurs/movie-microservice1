package com.example.movie.model;

import java.util.List;

public class Movie {
    String movieName;
    String movieGener;
    String movieLanguage;

    public void setTheaters(List<MovieTheater> theaters) {
        this.theaters = theaters;
    }

    List<MovieTheater> theaters;

    public Movie(String movieName,String movieGener,String movieLanguage){
        this.movieName = movieName;
        this.movieGener = movieGener;
        this.movieLanguage = movieLanguage;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGener() {
        return movieGener;
    }

    public void setMovieGener(String movieGener) {
        this.movieGener = movieGener;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    public List<MovieTheater> getTheaters() {
        return theaters;
    }

}
