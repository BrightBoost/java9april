package org.example.debuggingstuff;

import java.util.Scanner;
import java.util.Random;

// This logic contains an error, use the debugger to find it
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
        Scanner scanner = new Scanner(System.in);

        System.out.println("I have randomly chosen a number between 1 and 10.");
        System.out.println("You have 5 attempts to guess it.");

        boolean hasGuessedCorrectly = false;
        int attempts = 0;

        while (attempts > 5 && !hasGuessedCorrectly) {
            System.out.print("Guess (" + (attempts + 1) + "): ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
            } else {
                if (attempts == 5) {
                    System.out.println("You have used all your attempts. Better luck next time!");
                } else {
                    if (userGuess < randomNumber) {
                        System.out.println("It's lower than " + userGuess + ". Try again.");
                    } else {
                        System.out.println("It's higher than " + userGuess + ". Try again.");
                    }
                }
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        }

        scanner.close();
    }
}


