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
public class DoItBetter {
    public static void main(String[] args) {
        
        int userMiles, userLanguages, userHotdogs;
        
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        userMiles = Integer.parseInt(myScanner.nextLine());
        System.out.println("That's cool, but I can run " + (userMiles * 2 + 1) + " miles");
        System.out.println();
        
        System.out.println("How many hotdogs can you eat?");
        userHotdogs = Integer.parseInt(myScanner.nextLine());
        System.out.println("That's it?! I can eat " + (userHotdogs *2 + 1) + " hotdogs"); 
        System.out.println();
        
        System.out.println("How many languages can you speak?");
        userLanguages = Integer.parseInt(myScanner.nextLine());
        System.out.println("That's not very many.. I know " + (userLanguages *2 + 1) + " languages"); 
        
    }
}
