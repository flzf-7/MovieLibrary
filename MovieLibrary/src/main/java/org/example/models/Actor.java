package org.example.models;

import java.util.List;

public class Actor {

    private String firstName;
    private String lastName;
    //private List<Movie> listOfMovies;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   /* public List<Movie> getListOfMovies() {
        return listOfMovies;
    }

    public void setListOfMovies(List<Movie> listOfMovies) {
        this.listOfMovies = listOfMovies;
    }*/

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                //", listOfMovies=" + listOfMovies +
                '}';
    }
}
