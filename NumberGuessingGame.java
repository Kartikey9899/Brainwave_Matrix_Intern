import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[]args)
    {
        Random R = new Random();
        int numberToGuess = R.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess ;
        int attempts = 5;
        int numb ;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have " + attempts + " attempts.");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            attempts--;
            System.out.println("You have " + attempts + " attempts left.");
        }

        if (attempts == 0) {
            System.out.println("You've run out of attempts! The correct number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}
