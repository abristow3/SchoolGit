/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abris.module1codereview;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        int age;
        int maxBpm;
        double fiftyPercentMax;
        double eightyFivePercentMax;
        
        age = readValue("What is your age?");
        maxBpm  = 220 - age;
        fiftyPercentMax = maxBpm * .5;
        eightyFivePercentMax = maxBpm * .85;
        System.out.println("Your maximum heart rate should be " + maxBpm + " beats per minute");
        System.out.println("Your target HR zone is " + fiftyPercentMax + " - " + eightyFivePercentMax + " beats per minute.");
        
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
        // return the int value
        return number;
        }
}
