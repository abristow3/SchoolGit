/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abris.adder;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class adder {
    public static void main(String[] args){
       
      String name;
      int age;
      int numComputers;
      String homeTown;
      
      Scanner myScanner = new Scanner(System.in);
      
      System.out.println("Please enter your name");
      name = myScanner.nextLine();
      System.out.println("Please enter your age");
      age = myScanner.nextInt();
      System.out.println("Please enter the number of computers");
      numComputers = myScanner.nextInt();
      myScanner.nextLine();
      System.out.println("Please enter your hometown");
      homeTown = myScanner.nextLine();
      
      
      System.out.println("You Said");
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Number of Computers: " + numComputers);
      System.out.println("Hometown: " + homeTown);
 
    }
    
}
