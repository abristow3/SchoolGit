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
public class FieldDay {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        String userName;
      
        
        System.out.println("What is your last name?");
        userName = myScanner.nextLine();
        
        if (userName.compareToIgnoreCase("Baggins") < 0){
            System.out.println("You are on the team 'Red Dragons'!");
        } 
        else if (userName.compareToIgnoreCase("Baggins") > 0 && userName.compareToIgnoreCase("Dresden") < 0){
            System.out.println("You are on the team 'Dark Wizards'!");   
        }
        else if (userName.compareToIgnoreCase("Dresden") > 0 && userName.compareToIgnoreCase("Howl") < 0){
            System.out.println("You are on the team 'Moving Castles'!");
        }
        else if (userName.compareToIgnoreCase("Howl") > 0 && userName.compareToIgnoreCase("Potter") < 0){
            System.out.println("You are on the team 'Golden Snitches'!");
        }
        else if (userName.compareToIgnoreCase("Potter") > 0 && userName.compareToIgnoreCase("Vimes") < 0){
            System.out.println("You are on the team 'Night Guards'!");
        }
        else if (userName.compareToIgnoreCase("Vimes") > 0){
            System.out.println("You are on the team 'Black Holes'!");
        }

    }
}
