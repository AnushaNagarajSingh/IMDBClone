package com.example.springdemo.Filters.impl;

import com.example.springdemo.DAO.Models.Movie;
import com.example.springdemo.Filters.Filter;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RatingsFilter implements Filter {

    @Override
    public List<Movie> performFilter() {
        return null;
    }
}
