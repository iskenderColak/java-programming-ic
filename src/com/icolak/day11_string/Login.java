package com.icolak.day11_string;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String givenUsername = "Cydeo";
        String givenPassword = "WoodenSpoon";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        input.close();

        if (username.equals(givenUsername) && password.equals(givenPassword)) {
            System.out.println("You are now logged in");
        } else {
            System.err.println("Incorrect username or password. Please try again");
        }

    }
}

/*
2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */
