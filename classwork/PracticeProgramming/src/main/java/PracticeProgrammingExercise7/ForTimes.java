/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise7;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ForTimes {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int userNumber;
        int product;
        
        System.out.println("Please enter a number");
        userNumber = Integer.parseInt(input.nextLine());
        
        for(int i = 1; i < 16; i ++){
           product = userNumber * i;
           System.out.println(i + " * " + userNumber + " is : " + product);
        }

    }
}
