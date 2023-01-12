package com.example.springdemo;

import com.example.springdemo.DAO.Models.Movie;
import com.example.springdemo.Filters.Filter;
import com.example.springdemo.Filters.impl.GenreFilter;
import com.example.springdemo.Filters.impl.LanguageFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 *
 * 1. Component Scan
 * 2. Enable Autoconfiguration
 * 3. Configuration
 */
@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);

        Filter filter = context.getBean(GenreFilter.class);
        List<Movie> movies = filter.performFilter();

        for(Movie m : movies) {
            System.out.println(m.getName());
        }

        System.out.println("Filtered based on Genre");

        filter = context.getBean(LanguageFilter.class);
        List<Movie> otherMovies = filter.performFilter();


        for(Movie m : otherMovies) {
            System.out.println(m.getName());
        }

        System.out.println("Filtered based on Language");

        System.out.println("End of the application");
    }

}
