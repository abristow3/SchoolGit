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
public class LazyTeenager {
    public static void main(String[] args) {
        Random chance = new Random();
        
        int timesTold = 1;
        boolean roomDirty = true;
        int cleanChance = 10;
        int teenagerResponse;
        
       do {
          System.out.println("Clean your room! (x" + timesTold + ")");
             teenagerResponse = chance.nextInt(cleanChance)+1;
             if ( timesTold >= 7){
                  System.out.println("Alright thats it you're grounded!");
                  break;
             }
             if (teenagerResponse == 1 ){
                 System.out.println("Fine I'll clean.");
                 roomDirty = false;
                 break;
             }
             cleanChance --;
             timesTold ++;
       } while (roomDirty);
           
       }

    }

