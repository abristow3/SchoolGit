/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterestCalculator;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class InterestCalculator {
    public static void main(String[] args) {
        
     double currentBalance = readValue("How much money would you like to invest?");
     int yearsInvested = readValue("How many years are you investing for?");
     double interestRate = readValue("What is the annual interest rate % growth?");
     double beginBalance;
     double endBalance;
     
     System.out.println("Calculating.....");

     
     for(int i = 1; i <= yearsInvested; i++){
         beginBalance = currentBalance;
         for(int j = 0; j < 4; j++){
             currentBalance = currentBalance * (1 + (interestRate / 100));
         }
        endBalance = currentBalance;
        System.out.println("Year " + i + ":");
        System.out.printf("Begin with $%.2f\n", beginBalance);
        System.out.printf("Earned: $%.2f\n", (endBalance - beginBalance));
        System.out.printf("Ended with: $%.2f\n", endBalance );
        System.out.println();
     }
        
    }
    
    public static int readValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        // print prompt to console
        System.out.println(prompt);
        // read value into String data type
        String input = sc.nextLine();
        // convert the String to a float
        int number = Integer.parseInt(input);
        // return the float value
        return number;
    }
}
