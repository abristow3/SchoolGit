/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abris.module1codereview;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int rounds = 0;
        int userWins = 0;
        int ties = 0;        
        int computerWins = 0;
        int computerChoice;
        int playAgain;
        
        //while loop to reset rounds played until it is within the bounds of 1 and 10
        do{
            rounds = readValue("How many rounds would you like to play?");
            while(rounds < 1 || rounds > 10){
                    System.out.println("You must play between 1 and 10 rounds, try again.");
                    rounds = readValue("How many rounds would you like to play?");
                }
        //for loop to loop through user input rounds and generate random computer selection
        for (int i = 0; i < rounds; i++){
            int userChoice = readValue("\nRock (1), Papaer (2), or Scissors (3)?");
            computerChoice = rand.nextInt(3) + 1;
            System.out.println(computerChoice);
            //if statemenet to check win loss or tie conditions and increment each variable as necessary
            if((userChoice == 1 && computerChoice == 3) || (userChoice == 3 && computerChoice == 2) || (userChoice == 2 && computerChoice == 1)){
                System.out.println("You won that round.");
                userWins ++;
            } else if((userChoice == 1 && computerChoice == 2) || (userChoice == 2 && computerChoice == 3) || (userChoice == 3 && computerChoice == 1)){
                System.out.println("You lost that round.");
                computerWins++;
            } else { System.out.println("We tied that round");
                ties++;
            }  
        }  
            System.out.println("\nWe tied " + ties + " times.");
            System.out.println("I won " + computerWins + " rounds");
            System.out.println("You won " + userWins + " rounds");
            
            //if statement to print out end of game message based on wins
            if(userWins > computerWins){
                System.out.println("Congratulations, you beat me!");
            } else if(userWins < computerWins){
                System.out.println("haha I won, you should try again.");
            } else {
                System.out.println("Wow we tied!!!!");   
            }
            playAgain = readValue("Would you like to play again? (yes = 1/no = 0)");
            if(playAgain == 1){
                userWins =0;
                computerWins = 0;
                ties = 0;
            }
        }
        while (playAgain == 1);
    }
    
    public static int readValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        // print prompt to console
        System.out.println(prompt);
        // read value into String data type
        String input = sc.nextLine();
        // convert the String to a float
        int number = Integer.parseInt(input);
        // return the int value
        return number;
        }
}
