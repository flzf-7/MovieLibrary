package org.example.handlers;

import org.example.models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {

    static Scanner scanner = new Scanner(System.in);

    public static MenuOptions getMenuOptionFromUser() {

        return MenuOptions.values()[getSelectedOptionFromUser() - 1];

    }

    private static int getSelectedOptionFromUser() {

        int result = getIntegerFromUser();
        scanner.nextLine();

        if (result > 0 && result < MenuOptions.values().length + 1) {

            return result;

        } else {

            System.out.println("Please select a valid option");
            System.out.println("Try again");
            return getSelectedOptionFromUser();

        }

    }

    private static int getIntegerFromUser() {

        while (!scanner.hasNextInt()) {

            scanner.nextLine();
            System.out.println("It is not a number");
            System.out.println("Try again");

        }

        return scanner.nextInt();

    }


}
