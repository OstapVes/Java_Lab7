package com.company;

public class Main {

    public static void main(String[] args) {
        Movie.printStaticNumber_of_movie();
        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Nice guys", 1990, "Biographical drama", 146, 1398, 8.7, "KINOMAN", 19.99);
        Movie movie3 = new Movie("Back to the future", 1985, "Adventure comedy, fantasy", 175, 4255, 8.5, "SkyMall", 14.99);
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        movie1.printNumber_of_movie();
        movie1.resetValues("The Godfather", 1972, "Crime", 175, 4255, 9.2, "Cinema Citi", 9.99);
        System.out.println(movie1);
    }
}
