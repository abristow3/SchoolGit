/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorizer;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Factorizer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int count = 0;
        int cumulitiveNum = 0;
        boolean prime = false;
        
        userNumber = readValue("what number would you like to factor?");
        System.out.println("The factors of " + userNumber + " are: ");
        
        for(int i = 1; i <= userNumber; i++){
            if(userNumber % i == 0){
                System.out.print(i + " ");
                count++;
                cumulitiveNum += i;
            }
        }
        
        cumulitiveNum -= userNumber;
        System.out.println("\n" + userNumber + " has " + count + " factors.");
        if(cumulitiveNum == userNumber){
            System.out.println(userNumber + " is a perfect number");
        }
        if(count == 2){
            System.out.println(userNumber + " is a prime number.");
        } else {
            System.out.println(userNumber + " is not a prime number");
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
