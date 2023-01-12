package com.example.springdemo.service;

import com.example.springdemo.DAO.Models.Movie;
import com.example.springdemo.Filters.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.springdemo.DAO.Fetchers.MoviesDB.moviesDB;

/**
 * Difference between Rest controller and controller
 *
 * Controller can be used to resolve paths if it's a web-application
 *
 * RestController is a specialization of Controller used to handle REST api end-points
 */
@RestController
@RequestMapping(value="v1/imdbservice/")
public class IMDBService {
    @Qualifier("genreFilter")  //if there are more than one bean of the same type
    @Autowired
    private Filter filter;  // field or property based injections - these are not preferred in java, but easy to use. so ppl use.

    @RequestMapping(value = "getMovies", method = RequestMethod.GET)
    @ResponseBody
    List<Movie> getMovies() {
        return moviesDB.getMovies();
    }

    @RequestMapping(value = "getFilteredMovies", method = RequestMethod.GET)
    @ResponseBody
    List<Movie> getFilteredMovies() {
        return filter.performFilter();
    }

    @RequestMapping(value="addMovie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Movie addMovie(@RequestBody Movie movie) {      // Reuest method POST will have Request body
        moviesDB.addMovie(movie);
        return movie;
    }


    // Home_Work: Implement a filter based on Search and return Movies which start with that Search keyword.
    // Functional Req - API - GET -> localhost:8080/v1/imdbservice/search/{search_word} -> Returns List<Movie>

    @RequestMapping(value="searchMovie/{searchWord}", method = RequestMethod.GET)
    @ResponseBody
    List<Movie> searchMovie(@PathVariable String searchWord) {
        return moviesDB.getMovies().stream().filter(m -> m.getName().contains(searchWord)).collect(Collectors.toList());
    }

}
