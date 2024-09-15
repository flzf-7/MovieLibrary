package org.example;

import org.example.handlers.MenuHandler;
import org.example.handlers.UserInputHandler;
import org.example.models.MovieLibrary;

public class MovieLibraryApp {


    public static void main(String[] args) {

        MovieLibrary movieLibrary = new MovieLibrary();
        movieLibrary.fillMovieList();

        while (true) {

            MenuHandler.printMenu();

            switch (UserInputHandler.getMenuOptionFromUser()) {

                case DISPLAY_INFORMATION_ABOUT_RANDOM_MOVIE:
                    movieLibrary.getRandomMovieInformation();

                    break;
                case DISPLAY_ACTOR_MOVIES:
                    movieLibrary.getActorFilmography();
                    break;
                case QUIT:
                    System.out.println("Quitting");
                    System.exit(1);
            }
        }
    }
}