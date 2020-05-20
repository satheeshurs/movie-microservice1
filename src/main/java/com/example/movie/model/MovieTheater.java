package com.example.movie.model;

public class MovieTheater {
    String movieName;
    String theaterName;
    String theaterLocation;

    public MovieTheater(String movieName, String theaterName, String theaterLocation){
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.theaterLocation = theaterLocation;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getTheaterLocation() {
        return theaterLocation;
    }

    public void setTheaterLocation(String theaterLocation) {
        this.theaterLocation = theaterLocation;
    }

}
