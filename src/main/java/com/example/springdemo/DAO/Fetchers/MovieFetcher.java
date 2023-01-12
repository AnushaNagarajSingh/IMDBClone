package com.example.springdemo.DAO.Fetchers;


import com.example.springdemo.DAO.Models.Movie;

import java.util.List;

public class MovieFetcher {
    public static List<Movie> getAllMovies() {
        // we have a db - fetches db - we are simulating for now
        return MoviesDB.moviesDB.getMovies();
    }
}
