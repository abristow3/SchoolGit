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
public class HighRoller {
    public static void main(String[] args) {
        
        Random diceRoller = new Random(); 
        Scanner diceSides = new Scanner(System.in);
        

        
        System.out.println("How many sides does your die have?");
        String numberSides = diceSides.nextLine();
        int sides = Integer.parseInt(numberSides);
        System.out.println("TIME TO ROLL THE DICE!");

        int rollResult = diceRoller.nextInt(sides) + 1;
        
        System.out.println("I rolled a " + rollResult);
        
        if(rollResult == 1){
            System.out.println("You rolled a critical failure!");
        } else if(rollResult == sides){
          System.out.println("You rolled a critical! Nice job!");  
        }

        
    }
}
