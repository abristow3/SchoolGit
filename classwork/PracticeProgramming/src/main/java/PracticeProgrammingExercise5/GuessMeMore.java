/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class GuessMeMore {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        Random numGen = new Random();
        
        int max = 100;
        int min = -100;
        int myNumber = numGen.nextInt(max - min) + min;
        int userNumber;
        
        System.out.println("Please enter a number of your choice");
        userNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        System.out.println("Your guess: " + userNumber);
        System.out.println();
      
        if (myNumber == userNumber){
            System.out.println("Wow nice guess, that was it!");
        } else if (myNumber > userNumber){
            System.out.println("Ha, nice try - too low. Try Again!");
            userNumber = Integer.parseInt(myScanner.nextLine());
         if (myNumber == userNumber){
            System.out.println("Wow nice guess, that was it!");
         } else if (myNumber > userNumber){
            System.out.println("Ha, nice try - too low. My number was: " + myNumber);
         } else if (myNumber < userNumber){
            System.out.println("Too bad, way too high. I chose: " + myNumber);
         }
        } else if (myNumber < userNumber){
            System.out.println("Too bad, way too high. Choose again!");
            userNumber = Integer.parseInt(myScanner.nextLine());
         if (myNumber > userNumber){
            System.out.println("Ha, nice try - too low. My Number was: " + myNumber);
        } else if (myNumber < userNumber){
            System.out.println("Too bad, way too high. I chose: " + myNumber);
        } else if (myNumber == userNumber){
            System.out.println("Wow nice guess, that was it!");
        }
        }
        }
    }

