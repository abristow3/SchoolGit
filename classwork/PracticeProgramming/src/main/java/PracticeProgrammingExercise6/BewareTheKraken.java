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
public class BewareTheKraken {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        Random fishType = new Random();
        
      System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
      System.out.println("Here we go!......*SPLASH*");
      
      int depthDivedInFeet = 0;
      String fish1 = "Clown fish";
      String fish2 = "beta fish";
      String fish3 = "Shark!";
      
      // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        
      while(depthDivedInFeet < 36000){
          System.out.println("So far we've swam " + depthDivedInFeet + " feet");
          
          if (depthDivedInFeet >= 20000){
              System.out.println("Uhhh, I think I see a kraken guys....");
              System.out.println("TIME TO GO!");
              break;
          }
          // I can swim, really fast! 500ft at a time!
          System.out.println("would you like to keep diving down?(y/n)");
          String action = myScanner.nextLine();
          if(action.equals("y")){
          depthDivedInFeet += 1000;
          int fishGuess =  fishType.nextInt(3)+1;
           if (fishGuess == 1){
               System.out.println("oh look a " + fish1);
           } else if (fishGuess == 2){
              System.out.println("oh look a " + fish2); 
           } else if (fishGuess == 3){
               System.out.println("oh look a " + fish3);
           }
          } else {
              System.out.println("Okay time to surface!");
              break;
          }
      }
      
      System.out.println("");
      System.out.println("We ended up swimming " + depthDivedInFeet + " feet down");
      System.out.println("I bet we can do better next time");
    }
}
