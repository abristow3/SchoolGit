/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise6;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class LovesMe {
    public static void main(String[] args) {
       
        int petals = 34;
       
       System.out.println("Well here goes nothing");
       
       do {
       if (petals % 2 == 0){
           System.out.println("It loves me not");
           petals --;
       } else {
           System.out.println("It loves me");
           petals --;
       }
       } while (petals > 0);
       
       System.out.println("I knew it, it loves me");
        
        
        
        
    }
}
