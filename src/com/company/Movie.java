package com.company;

public class Movie {
    private String name = "";
    private int graduation_year = 0;
    private String genre = "";
    private int duration = 0;
    private int number_of_reviews = 0;
    private double imdb_rating = 0.0;


    public Movie(String name, int graduation_year, String genre, int duration, int number_of_reviews,
                 double imdb_rating) {
        this.name = name;
        this.graduation_year = graduation_year;
        this.genre = genre;
        this.duration = duration;
        this.number_of_reviews = number_of_reviews;
        this.imdb_rating = imdb_rating;
    }

    @Override
    public String toString() {
        return "Movie{"
                + "Name:" + name
                + ", Graduation year:" + graduation_year
                + ", Genre:" + genre
                + ", Duration:" + duration
                + ", Number of reviews:" + number_of_reviews
                + ", Imdb rating:" + imdb_rating
                + "}";
    }


    public void resetValues(String name, int graduation_year, String genre, int duration, int number_of_reviews,
                            double imdb_rating) {
        this.name = name;
        this.graduation_year = graduation_year;
        this.genre = genre;
        this.duration = duration;
        this.number_of_reviews = number_of_reviews;
        this.imdb_rating = imdb_rating;
    }

    public String getName() {
        return this.name;
    }

    public int getGraduationYear() {
        return this.graduation_year;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getNumberOfReviews() {
        return this.number_of_reviews;
    }

    public double getImdbRating() {
        return this.imdb_rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGraduationYear(int graduation_year) {
        this.graduation_year = graduation_year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setNumberOfReviews(int number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }

    public void setImdbRating(double imdb_rating) {
        this.imdb_rating = imdb_rating;
    }
}