package com.example.springdemo.Filters;

import com.example.springdemo.DAO.Models.Movie;

import java.util.List;

public interface Filter {
    List<Movie> performFilter();
}
