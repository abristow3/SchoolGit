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
public class PickyEater {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("How many times has it been fried? (#) ");
        int timeFried = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Does it have any spinach in it? (y/n)");
        String hasSpinach = myScanner.nextLine();
        
        System.out.println("Is it covered in cheese? (y/n)");
        String cheeseCovered = myScanner.nextLine();
        
        System.out.println("How many pats of butter are on top?");
        int butterPats = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Is it covered in chocolate? (y/n)");
        String chocolateCovered = myScanner.nextLine();
        
        System.out.println("Does it have a funny name? (y/n)");
        String funnyName = myScanner.nextLine();
        
        System.out.println("Is it broccoli? (y/n)");
        String isBroccoli = myScanner.nextLine();
        
        if (hasSpinach.equals("y") || funnyName.equals ("y")) {
            System.out.println("There's no way he'll eat that!");
        }
        if (timeFried > 2 && timeFried < 4 && chocolateCovered.equals ("y")){
            System.out.println("Oh, it's like a deep-fried Snickers. THat'll be a hit!");
        }
        if( timeFried == 2 && cheeseCovered.equals("y") ){
            System.out.println("Mmm. Yeah, he'll eat fried cheesy doodles.");
        }
        if (isBroccoli.equals("y") && butterPats > 6 && cheeseCovered.equals ("y")){
            System.out.println("As long as the green is hidden by cheddar, it'll happen!");
        }
        if (isBroccoli.equals("y")){
            System.out.println("Ph, green stuff like that might as well go in the bin");
        }
    }
}
