/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class GuessMeFinally {
   public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        Random numGen = new Random();
        
        int max = 100;
        int min = -100;
        int myNumber = numGen.nextInt(max - min) + min;
        int userNumber;
        int tries = 0;

       do{
        System.out.println("Please enter a number of your choice");
        userNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println("Your guess: " + userNumber);
        System.out.println();
        if( userNumber > myNumber){
            System.out.println("That's too high, try again.");
            tries ++;
        } else if (userNumber < myNumber){
            System.out.println("That's too low try again");
            tries ++;
        } else if (userNumber == myNumber && tries < 1){
            System.out.println("Wow you got it first try");
        } else if (userNumber == myNumber && tries > 1){
            System.out.println("About time you guessed it");
        }else {
            System.out.println("Please enter a number");
            tries ++;
        }
   } while (userNumber != myNumber);
       
       System.out.println("Thanks for playing");
   }
}