/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise8;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = randomColor();
        String animal = randomAnimal();
        String colorAgain = randomColor();
        int weight = randomNumber(5,200);
        int distance = randomNumber(10,20);
        int number = randomNumber(10000,20000);
        int time = randomNumber(2,6);
        
        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
        
    }
    
    public static String randomColor(){
        String color = "";
                
        Random randomColor = new Random();
        int i = randomColor.nextInt(5);
        
        switch (i){
          case 0:
              color = "pink";
              break;
          case 1:
              color = "red";
              break;
          case 2:
              color = "blue";
              break;
          case 3:
              color = "green";
              break;
          case 4: 
              color = "orange";
              break;
        }
       return color;
    }
    
    public static String randomAnimal(){
        String animal = "";
                
        Random randomColor = new Random();
        int i = randomColor.nextInt(5);
        
        switch (i){
          case 0:
              animal = "elephant";
              break;
          case 1:
              animal = "eagle";
              break;
          case 2:
              animal = "rhino";
              break;
          case 3:
              animal = "llama";
              break;
          case 4: 
              animal = "turtle";
              break;
        }
       return animal;
    }
        
    public static int randomNumber(int min, int max){
        Random numGen = new Random();
        
        int myNumber = numGen.nextInt(max - min) + min;
        return myNumber;

        }
}
