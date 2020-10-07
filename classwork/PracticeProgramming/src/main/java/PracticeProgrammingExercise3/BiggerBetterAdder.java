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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        
        int number1, number2, number3, number4;
        
       
        Scanner myScanner = new Scanner(System.in);
         
        System.out.println("Please enter a number for us to add for you: ");
        number1 = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        System.out.println("Please enter another one to add: ");
        number2 = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        System.out.println("Please enter a final one to add: ");
        number3 = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        number4= number1 + number2 + number3;
        
        System.out.println(number1 + "+" + number2 + "+" + number3 + "=" + number4);
       
        
        
    }
}
