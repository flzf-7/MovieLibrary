package org.example.handlers;

import org.example.models.MovieLibrary;

import java.util.Random;

public class RandomDataHandler {

    static Random random = new Random();

    public static int getRandomMovieIndex() {

        return random.nextInt(MovieLibrary.getMoviesLibrary().size());

    }
}
