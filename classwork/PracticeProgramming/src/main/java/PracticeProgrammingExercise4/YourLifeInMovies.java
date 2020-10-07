/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise4;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int userAge;
        String userName;
        
        System.out.println("Let's play a game! What is your name?");
        userName = myScanner.nextLine();
        System.out.println();
        
        System.out.println("Ok, " + userName + " what year were you born?");
        userAge = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        System.out.println("Well " + userName);
        
        if (userAge < 2005){
            System.out.println("Wow, Disney's 'Up' came out over a decade ago.");
        }
        if (userAge < 1995){
           System.out.println("Harry Potter came out over 15 years ago!"); 
        }
        if (userAge < 1985){
            System.out.println("Space Jame came out not last decade...but the one BEFORE THAT!!!!");
        }
        if (userAge < 1975){
           System.out.println("The original Jerassic Park release is closer to the first lunar landing than it is today!"); 
        }
        if (userAge < 1965){
            System.out.println("M.A.S.H TV series has been around for almost half a century!");
        }
        
    }
}
