/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise5;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class Opinionator {
    public static void main(String[] args) {
        
      Random randomizer = new Random();  
        
      System.out.println("I can't decide what animal I like the best."); 
      System.out.println("I know! Random can decide for me!");
      
      int x = randomizer.nextInt(5);
      
      System.out.println("The number we chose was: " + x);
      
      switch (x){
          case 0:
              System.out.println("Llamas are the best!");
              break;
          case 1:
              System.out.println("Dodos are the best!");
              break;
          case 2:
              System.out.println("Wooly mammoths are the best!");
              break;
          case 3:
              System.out.println("Sharks are the best!");
              break;
          case 4:
              System.out.println("Cockatoos are just so awesome!");
              break;
          case 5:
              System.out.println("Have you ever met a naked mole-rat? They are the best!");
              break;
              //case 5 can never be rolled as random rounds down to the nearest int. only a 0-4 can be rolled as the 5 random integers.
      }
        System.out.println("Thanks random, you're the best!");
    }
}
