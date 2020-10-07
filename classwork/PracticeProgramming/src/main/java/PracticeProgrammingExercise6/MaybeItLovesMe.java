/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise6;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class MaybeItLovesMe {
    public static void main(String[] args) {
        
        Random numGen = new Random();
       
        int max = 89;
        int min = 13;
        int petals = numGen.nextInt((max - min)+1) + min;
        String message;
       System.out.println("Petals: " + petals);
       System.out.println("Well here goes nothing");
       
       Boolean x = true;   
        
        do{
          if (x) {
              System.out.println("It loves me!");
              petals--;
              x = false;
          } else {
              System.out.println("It loves me not!");
              petals--;
              x = true;
          }
            
            
        } while (petals > 0);
        if (x) {
            System.out.println("Bummer!");
        }   else {
            System.out.println("Yay!!");
        } 

        
    }
}

