/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise6;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class StayPositive {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int start;
        int end = 0;
        
        System.out.println("Please enter a starting number to count down from");
        start = Integer.parseInt(myScanner.nextLine());
        
        if (start < 0){
            System.out.println("Please enter a positive number...");
            start = Integer.parseInt(myScanner.nextLine());
        } else {
        System.out.println("counting down");
        
        while (start >= end){
            if(start%10==0){
                System.out.println();
            }
            System.out.print(start + " ");
            start --;
        }
        
        System.out.println("Blast off!");
        
        }
    }
}
