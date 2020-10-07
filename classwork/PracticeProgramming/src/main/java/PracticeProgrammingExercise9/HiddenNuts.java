/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise9;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class HiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        
        int location = 0;
        int count = 0;

        for(int i = 0; i < hidingSpots.length; i++){
            if(hidingSpots[i] == "Nut"){
                location = count;
            } else {
                count++;
            }
        }
        
        System.out.println("Found it! It's in spot# " + location);
    }
}
