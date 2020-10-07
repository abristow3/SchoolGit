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
public class QuestForUserInput {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String yourName, yourQuest;
        double velocityOfSwallow;
        
        // We can use the Scanner's readline to assign value to our strings
        // because its return type is string
        System.out.println("what is your name?");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest?!");
        yourQuest = inputReader.nextLine();
        
        //When we get our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert nextLine's String
        
        System.out.println("What is the air speed velocity of an unladen swallow?!?!? ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName);
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + " ");
        
    }
}
