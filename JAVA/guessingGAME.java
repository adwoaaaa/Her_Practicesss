package JAVA;

import java.util.Scanner;
public class guessingGAME {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 20) + 1;
        // Generates a Random number between 1 and 20 for the guessing game
        System.out.println("WELCOME TO MY GUESSING GAME");
        System.out.println("");
        System.out.println("Guess a number from 1 to 20 ");
        System.out.println("");

        int attempts = 0;
        boolean guess = false;

        while (!guess){
            System.out.print("Enter your number: ");
             int number = input.nextInt();
                     attempts++;
             if (number == randomNumber){
                System.out.println("GENIUS! You guessed correctly.");
                System.out.println("Total number of attempts: " + attempts);
                    guess = true;
             }else if (number > 20) {
                 System.out.println("Sorry, the number you guessed is not within 1 to 20.");
             } else if (number > randomNumber) {
                 System.out.println("OPPS! The number you guessed is too high, keep trying.");
             }else {
                 System.out.println("OPPS! The number you guessed is too low, keep trying.");
             }
        }
   
    }
}