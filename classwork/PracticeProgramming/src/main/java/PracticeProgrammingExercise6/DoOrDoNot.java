/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise6;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class DoOrDoNot {
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         
         
         System.out.println("Should I do it? (y/n)");
         boolean doIt;
         
         if(input.next().equals("y")){
         doIt = true; //DO IT
         } else {
             doIt = false;
         }
          boolean iDidIt = false;
          
         do {
             iDidIt = true;
             break;
         } while (doIt);
         
         if (doIt && iDidIt){
             System.out.println("I did it!");
         } else if (!doIt && iDidIt){
             System.out.println("I know you said not to..but i did it anyways");
         } else {
             System.out.println("Don't look at me, i didn't do anything.");
         }
         
         
     }
}
