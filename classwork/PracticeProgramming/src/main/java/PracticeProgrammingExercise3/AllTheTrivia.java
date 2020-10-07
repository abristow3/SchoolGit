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
public class AllTheTrivia {
    public static void main(String[] args) {
        
        String question1, question2, question3, question4, answer1, answer2, answer3, answer4;
        question1 = "Which company produces the iPad?";
        question2 = "What is one of the three primary colors?";
        question3 = "How did Alice enter Wonderland?";
        question4 = "What was Monty Python searching for?";
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println(question1);
        answer1 = inputReader.nextLine();
        System.out.println();
        
        System.out.println(question2);
        answer2 = inputReader.nextLine();
        System.out.println();
        
        System.out.println(question3);
        answer3 = inputReader.nextLine();
        System.out.println();
        
        System.out.println(question4);
        answer4 = inputReader.nextLine();
        System.out.println();
        
        System.out.println("Wow, " + answer2 + " produces the iPad!");
        System.out.println("Who knew " + answer3 + " was a primary color?!");
        System.out.println("That's crazy, Alice really ended up in wonderland by licking a " + answer4);
        System.out.println("Monty Python was searching for an " + answer1 + "... Interesting, I wonder why?.");
        
        
        
    }
}
