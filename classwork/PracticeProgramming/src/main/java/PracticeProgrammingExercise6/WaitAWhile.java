/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise6;

/**
 *
 * @author Alex
 */
public class WaitAWhile {
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;
        
        while (timeNow < bedTime){
            System.out.println("It's only " + timeNow + " 0'clock!");
            System.out.println("I think I'll stay up just a little bit longer...");
            timeNow ++; //Time passes
        }
        
        System.out.println("Oh it's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed....");
        
        
    }
}
