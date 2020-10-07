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
public class HealthyHearts {
    public static void main(String[] args) {
    
        
        int userAge, maximumHeartRate;
        double targetZone50, targetZone85;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("PLease enter your age");
        userAge = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        maximumHeartRate = 220 - userAge;
        targetZone50 = maximumHeartRate * .5;
        targetZone85 = maximumHeartRate * .85;
        
        System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is: " + targetZone50 + " - " + targetZone85 + " beats per minute." );
    
    
    
    
    }
}
