package com.example.springdemo.DAO.Models;

public class MovieBuilder {
    String name;
    Integer rating;
    String genre;
    String language;

    public MovieBuilder() {

    }

    public MovieBuilder buildWithName(String s) {
        this.name = s;
        return this;
    }

    public MovieBuilder buildWithGenre(String s) {
        this.genre = s;
        return this;
    }

    public MovieBuilder buildWithLanguage(String s) {
        this.language = s;
        return this;
    }

    public MovieBuilder buildWithRating(Integer s) {
        this.rating = s;
        return this;
    }

    public Movie build() {
        return new Movie(this);
    }

// Builder pattern in Java
//    public static void main(String[] args) {
//        MovieBuilder builder = new MovieBuilder();
//        // chaining is allowed
//        builder = builder.buildWithName("Inception").buildWithLanguage("English");
//        builder = builder.buildWithGenre("Science Fiction");
//        builder = builder.buildWithRating(5);
//
//        Movie movie = builder.build();
//    }
}
