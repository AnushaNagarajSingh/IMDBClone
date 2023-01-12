package com.example.springdemo.Filters.impl;

import com.example.springdemo.DAO.Fetchers.MovieFetcher;
import com.example.springdemo.DAO.Models.Movie;
import com.example.springdemo.Filters.Filter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class LanguageFilter implements Filter {
    @Override
    public List<Movie> performFilter() {
        List<Movie> movies = MovieFetcher.getAllMovies();
        return movies.stream().filter(m -> m.getLanguage().equals("Hindi")).collect(Collectors.toList());
    }
}
