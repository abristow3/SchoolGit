/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise4;

/**
 *
 * @author Alex
 */
public class SpaceRustlers {
    public static void main(String[] args) {
        
     int spaceships = 10;
     int aliens = 25;
     int cows = 100;
     
     if(aliens > spaceships){
         System.out.println("Vrroom, vroom!, Let's get going!");
     } else {
         System.out.println("THere aren't enough green guys  to drive these ships!");
     }
     
     if(cows == spaceships){
         System.out.println("Wow, way to plan ahead! Just enough room for all these walking hamburgers!");
         //else if allows us to implement another if statement if the first criteria of the above if statement is not met.
         //removing the else turns it into two seperate if statements which can produce 2 results instead of 1
     } else if(cows > spaceships){
         System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
     } else {
         System.out.println("Too many ships, not enough cows!");
     }
     if (cows < aliens){
         System.out.println("Hurray we've got a hamburger party on alpha centuri");
     } else if (cows >= aliens){
         System.out.println("Oh no, the herd has gotten restless and taken over. Looks like we're hanburgers now!");
     }
         
    
    }
}
