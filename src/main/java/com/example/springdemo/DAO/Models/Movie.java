package com.example.springdemo.DAO.Models;

import java.util.UUID;

public class Movie {
    String name;
    Integer rating;
    String genre;
    String language;
    String id;

    Movie(MovieBuilder movieBuilder) { //builder pattern
        this.name = movieBuilder.name;
        this.genre = movieBuilder.genre;
        this.language = movieBuilder.language;
        this.rating = movieBuilder.rating;
        this.id = String.valueOf(UUID.randomUUID());
    }

    public Movie(String name, String genre, String language, int rating) {
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Integer getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public String getID() {
        if (this.id == null) {
            this.id = String.valueOf(UUID.randomUUID());
        }

        return this.id;
    }

    // builder pattern


    public void setName(String name) {
        this.name = name;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
