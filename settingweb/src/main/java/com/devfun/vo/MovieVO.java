package com.devfun.vo;
public class MovieVO {
    private int movieId;
    private String movie_name; 
    private String director;
    private String types;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovie_name() { 
        return movie_name;
    }

    public void setMovie_name(String movie_name) { 
        this.movie_name = movie_name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) { 
        this.types = types;
    }
}
