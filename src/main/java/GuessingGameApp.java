import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
    Scanner guessingGame = new Scanner(System.in);

    System.out.println("Welcome to the Guessing Game!");
    System.out.println("The rules are simple. Guess and input a number between 1 and 10. You have 4 chances to guess correctly.");

    Random random = new Random();
    int randomNumber = random.nextInt(10) + 1;
    int guesses = 4;
    int userGuess;
    boolean isAWinner = false;
    
    
    while (!isAWinner) {
    
        System.out.println("Guess a number between 1 and 10.");
        userGuess = guessingGame.nextInt();
        
        if (userGuess == 0) {
            System.out.println("Guess a number between 1 and 10.");
            System.out.println("Guesses remaining: " + guesses);
        }
        else if (userGuess == -1) {
            System.exit(1);
        }
        else if (userGuess < -1 || userGuess > 10 && guesses != 0) {
            guesses--;
            System.out.println("Invalid answer. Try again.");
            System.out.println("Remaining guesses: " + guesses);
        }
        else if (userGuess < randomNumber && guesses != 0) {
            guesses--;
            System.out.println("Sorry, the answer is greater than " + userGuess);
            System.out.println("Guesses remaining: " + guesses);
        }
        else if (userGuess > randomNumber && guesses != 0) {
            guesses--;
            System.out.println("Sorry, the answer is less than " + userGuess);
            System.out.println("Guesses remaining: " + guesses);
        }
        else if (userGuess == randomNumber) {
            System.out.println(" :) Great job, you win!");
            break;
        }
        else if (guesses == 0) {
            System.out.println(" :( You lose. The number was " + randomNumber);
        }
            
        }

       
    guessingGame.close();
   
   
    }



}



