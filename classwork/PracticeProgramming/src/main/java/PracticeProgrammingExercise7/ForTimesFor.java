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
public class ForTimesFor {
    
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int userNumber;
        int product;
        int userAnswer;
        int points = 0;
        
        System.out.println("Please enter a number");
        userNumber = Integer.parseInt(input.nextLine());
        
        for(int i = 1; i < 16; i ++){
           product = userNumber * i;
           System.out.println(i + " * " + userNumber + " is : ");
                   userAnswer = Integer.parseInt(input.nextLine());
                   if (userAnswer == product){
                       points ++;
                   }     
        }
        System.out.println("You earned " + points + " points out of " + 15);
            if(points >= 13.5 ){
                System.out.println("Congrats you got over 90% correct!");
            }
            if(points <= 7.5 ){
                 System.out.println("You should study more");
            }
        }

    }

