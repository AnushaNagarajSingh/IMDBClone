package com.example.springdemo.Filters.impl;

import com.example.springdemo.DAO.Fetchers.MovieFetcher;
import com.example.springdemo.DAO.Models.Movie;
import com.example.springdemo.Filters.Filter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GenreFilter implements Filter {
    @Override
    public List<Movie> performFilter() {
        // It talks to some database and performs one filter

        List<Movie> movies = MovieFetcher.getAllMovies();

//        List<Movie> returnMovies = new ArrayList<>();
//        for (Movie m : movies) {
//            if (m.getGenre().equals("Science Fiction")) {
//                returnMovies.add(m);
//            }
//        }
//        return returnMovies;

        return movies.stream().filter(m -> m.getGenre().equals("Science Fiction")).collect(Collectors.toList());
    }
}
