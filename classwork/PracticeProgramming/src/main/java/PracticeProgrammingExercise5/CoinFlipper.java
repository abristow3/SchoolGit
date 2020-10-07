/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class CoinFlipper {
    public static void main(String[] args) {
        
        Random coinFlip = new Random(); 

        
        System.out.println("Ready. Set. FLIP!.....");
         
        coinFlip.nextBoolean();
        
        boolean heads = coinFlip.nextBoolean();

        
        if(heads){
        System.out.println("You flipped a heads!");
        } else {
            System.out.println("You flipped a tails!");
        }
        
    }
}
