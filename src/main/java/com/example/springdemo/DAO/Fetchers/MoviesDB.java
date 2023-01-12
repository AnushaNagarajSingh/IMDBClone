package com.example.springdemo.DAO.Fetchers;

import com.example.springdemo.DAO.Models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesDB {
    private List<Movie> movies;

    // Singleton Class
    public static MoviesDB moviesDB = new MoviesDB();

    private MoviesDB() {
        System.out.println("I am only created once per Application");
        movies = new ArrayList<>();

        Movie m1 = new Movie("Inception", "Science Fiction", "English", 5);
        Movie m2 = new Movie("Dhoom", "Action Drama", "Hindi", 4);
        Movie m3 = new Movie("Avatar", "Science Fiction", "English", 4);

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
    }


    public void addMovie(Movie m) {
        movies.add(m);
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
