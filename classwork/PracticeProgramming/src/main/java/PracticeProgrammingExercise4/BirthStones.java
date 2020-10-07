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
public class BirthStones {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int userMonth;
        
        System.out.println("What month's birthstone would you like to know?");
        userMonth = Integer.parseInt(myScanner.nextLine());
        System.out.println();
        
        if(userMonth < 1){
            System.out.println("Please enter a number between 1 and 12");
        } else if(userMonth > 12){
            System.out.println("Please enter a number between 1 and 12");
        } else if(userMonth == 1){
            System.out.println("January's birthstone is Garnet");
        } else if(userMonth == 2){
            System.out.println("February's birthstone is Amethyst");
        } else if(userMonth == 3){
            System.out.println("March's birthstone is Aquamarine");
        } else if(userMonth == 4){
            System.out.println("April's birthstone is Diamond");
        } else if(userMonth == 5){
            System.out.println("May's birthstone is Emerald");
        } else if(userMonth == 6){
            System.out.println("June's birthstone is Pearl");
        } else if(userMonth == 7){
            System.out.println("July's birthstone is Ruby");
        } else if(userMonth == 8){
            System.out.println("August's birthstone is Peridot");
        } else if(userMonth == 9){
            System.out.println("September's birthstone is Sapphire");
        } else if(userMonth == 10){
            System.out.println("October's birthstone is Opal");
        } else if(userMonth == 11){
            System.out.println("November's birthstone is Topaz");
        } else if(userMonth == 12){
            System.out.println("December's birthstone is Turqoise");
        }

        
    }
}
