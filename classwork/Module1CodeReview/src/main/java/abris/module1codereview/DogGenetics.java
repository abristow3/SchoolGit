/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abris.module1codereview;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class DogGenetics {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int newPercent;
        // max set to 95 so we can roll at least a 1% on each dog breed
        int max = 95;

        String dogName;
        String[] dogBreeds = {"Chihuaha", "Pit Bull", "Poodle", "German Shepherd", "French Bulldog"};
        
        dogName = readString("What is your dog's name?");
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is: ");
        
        for(int i = 0; i < dogBreeds.length; i++){
            if(i == dogBreeds.length - 1 || max == 0){
                newPercent = max;
            } else {
                newPercent = rand.nextInt(max)+1;
            }
            //adding 1 so our percenteages add up to 100
            System.out.println((newPercent + 1) + "% " + dogBreeds[i]);
            max = max - newPercent;  
        }
    }
    
    public static String readString(String prompt) {
        // declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        // print prompt to console
        System.out.println(prompt);
        // read value into String data type
        String input = sc.nextLine();
        // return the string value
        return input;
        }
}
