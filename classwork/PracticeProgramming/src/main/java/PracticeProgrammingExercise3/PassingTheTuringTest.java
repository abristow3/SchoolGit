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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
    String myName = "Alex", myColor = "red", myFruit = "Banana";
    String userName, userColor, userFruit;
    int myNumber = 3, userNumber, combinedNumber; 
    
    Scanner inputReader = new Scanner(System.in);
    
    System.out.println("Hello there!");
    System.out.println("What's your name?");
    
    userName = inputReader.nextLine();
    
    System.out.println("Hi " + userName + " my name is " + myName);
    System.out.println();
    System.out.println("What's your favorite color?");
    
    userColor = inputReader.nextLine();
    
    System.out.println("Huh " + userColor + "? Mine is " + myColor);
    System.out.println();
    System.out.println("I really like " + myFruit + ". They're my favorite fruit, too.");
    System.out.println("What's YOUR faovrite fruit, " +  userName);
    
    userFruit = inputReader.nextLine();
    
    System.out.println();
    System.out.println("Really? " + userFruit + "? That's Wild! ");
    System.out.println("Speaking of favorites, what's your favorite number?");
    
    userNumber = Integer.parseInt(inputReader.nextLine());
    combinedNumber = myNumber * userNumber;
    
    System.out.println();
    System.out.println( userNumber + " is a cool number. Mine is " + myNumber + ".");
    System.out.println("Did you know " + userNumber + " * 7 is " + combinedNumber + "? That's a cool number too!");
            
    System.out.println("Well thanks for talking to me " + userName + "!");   
    
    }
}
