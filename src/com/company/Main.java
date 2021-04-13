package com.company;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Godfather", 1972, "Crime", 175, 4255, 9.2);
        Movie movie2 = new Movie("Nice guys", 1990, "Biographical drama", 146, 1398, 8.7);
        Movie movie3 = new Movie("Back to the future", 1985, "Adventure comedy, fantasy", 175, 4255, 8.5);
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
    }
}