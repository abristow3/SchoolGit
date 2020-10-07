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
public class MiniMadLibs {
    public static void main(String[] args) {
        
        String noun1, adjective1, noun2, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresentTense, verbPastTense;
        int number;
        
        Scanner madScanner = new Scanner(System.in);
        
        System.out.println("Let's play MAD LIBS!!!!");
        System.out.println();
        
        System.out.println("I need a noun: ");
        noun1 = madScanner.nextLine();
        System.out.println();
        
        System.out.println("Now and adjective: ");
        adjective1 = madScanner.nextLine();
        System.out.println();
        
        System.out.println("Another noun: ");
        noun2 = madScanner.nextLine();
        System.out.println();
        
        System.out.println("And a number: ");
        number = Integer.parseInt(madScanner.nextLine());
        System.out.println();
        
        System.out.println("Another adjective: ");
        adjective2 = madScanner.nextLine();
        System.out.println();
        
        System.out.println("A plural noun: ");
        pluralNoun1 = madScanner.nextLine();
        System.out.println();
        
        System.out.println("Another one: ");
        pluralNoun2 = madScanner.nextLine();
        System.out.println();
        
        System.out.println("One more: ");
        pluralNoun3 = madScanner.nextLine();
        System.out.println();
        
        System.out.println("A verb (infinitive form: ");
        verbPresentTense = madScanner.nextLine();
        System.out.println();
        
        System.out.println("Same verb (past principle: ");
        verbPastTense = madScanner.nextLine();
        System.out.println();
        
        System.out.println("*** NOW LETS GET MAD (libs) ***: ");
        System.out.println(noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 + ".");
        System.out.println(" Its " + number + " year mission: to explore strange " + adjective2 + " " + pluralNoun1 + ", to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ",");
        System.out.println(" to boldly " + verbPresentTense + " where no one has " + verbPastTense + " before.");
    }
}
