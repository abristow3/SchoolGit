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
public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int totalFizzNeeded;
        int fizzbuzzCounter = 0;
        
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        totalFizzNeeded = input.nextInt();
        
        for(int i = 1; fizzbuzzCounter < totalFizzNeeded; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("Fizz Buzz");
                fizzbuzzCounter ++;
            } else if(i % 5 == 0){
               System.out.println("Buzz");
               fizzbuzzCounter ++;
            } else if (i % 3 == 0){
                System.out.println("Fizz");
                fizzbuzzCounter ++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!");
    }
}
