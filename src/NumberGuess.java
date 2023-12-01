

import java.util.Random;
import java.util.Scanner;

public class NumberGuess{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I have selected a random number. Try to guess it!");

	        int lowerBound = 1; 
	        int upperBound = 100;
	        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        int guess;
	        int attempts = 0;

	        do {
	            System.out.print("Enter your guess between " + lowerBound + " and " + upperBound + ": ");
	            guess = scanner.nextInt();
	            attempts++;

	            if (guess < secretNumber) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > secretNumber) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	            }
	        } while (guess != secretNumber);

	        scanner.close();
	    }
	}

