package com.company;

public class Movie {
    private String name = "The Godfather";
    private int graduation_year = 1972;
    private String genre = "Crime";
    private int duration = 175;
    private int number_of_reviews = 4255;
    private double imdb_rating = 9.2;
    private static int number_of_movie = 0;
    protected String name_of_the_cinema = "Cinema Citi";
    protected double price = 9.99;

    public Movie() {
        number_of_movie += 1;
    }

    public Movie(String name, int graduation_year, String genre, int duration) {
        this.name = name;
        this.graduation_year = graduation_year;
        this.genre = genre;
        this.duration = duration;
        number_of_movie += 1;
    }

    public Movie(String name, int graduation_year, String genre, int duration, int number_of_reviews,
                 double imdb_rating, String name_of_the_cinema, double price) {
        this(name, graduation_year, genre, duration);
        this.number_of_reviews = number_of_reviews;
        this.imdb_rating = imdb_rating;
        this.name_of_the_cinema = name_of_the_cinema;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie["
                + "Name:" + name
                + ", Graduation year:" + graduation_year
                + ", Genre:" + genre
                + ", Duration:" + duration
                + ", Number of reviews:" + number_of_reviews
                + ", Imdb rating:" + imdb_rating
                + ", Name of the cinema:" + name_of_the_cinema
                + ", Price:" + price + "$"
                + "]";
    }

    public static void printStaticNumber_of_movie() {
        System.out.println("Кількість результатів: " + number_of_movie);
    }

    public void printNumber_of_movie() {
        System.out.println("Кількість результатів: " + number_of_movie);
    }

    public void resetValues(String name, int graduation_year, String genre, int duration, int number_of_reviews,
                            double imdb_rating, String name_of_the_cinema, double price) {
        this.name = name;
        this.graduation_year = graduation_year;
        this.genre = genre;
        this.duration = duration;
        this.number_of_reviews = number_of_reviews;
        this.imdb_rating = imdb_rating;
        this.name_of_the_cinema = name_of_the_cinema;
        this.price = price;
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
