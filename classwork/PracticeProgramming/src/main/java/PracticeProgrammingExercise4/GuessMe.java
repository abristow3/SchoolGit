/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise4;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class GuessMe {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int myNumber = 1;
        String stringUserNumber;
        int userNumber;
        
        System.out.println("Please enter a number of your choice");
        userNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        System.out.println("Your guess: " + userNumber);
        System.out.println();
      
        if (myNumber == userNumber){
            System.out.println("Wow nice guess, that was it!");
        }
        if (myNumber > userNumber){
            System.out.println("Ha, nice try - too low. I chose: " + myNumber);
        }
        if (myNumber < userNumber){
            System.out.println("Too bad, way too high. I chose: " + myNumber);
        }
        
    }
}
