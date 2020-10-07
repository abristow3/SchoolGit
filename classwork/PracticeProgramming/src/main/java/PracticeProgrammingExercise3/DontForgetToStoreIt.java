/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise3;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class DontForgetToStoreIt {
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14149;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals: ");
        Double.parseDouble(inputReader.nextLine());
        
        //We've used double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll use INteger.parseInt
        
        System.out.println("What is the meaning of life, the universe, and everything?");
        Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is your favorite kind of cheese?");
        inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more?");
        inputReader.nextLine();
        
        //        System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
//        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
       
        
        
    }
    
}
