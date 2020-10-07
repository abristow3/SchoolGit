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
public class MiniZork {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("There is a large chest to your north.");
        System.out.println("Go to the house, go to the chest, or open the mailbox? ");

        String action = myScanner.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = myScanner.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = myScanner.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You feel something hairy..it bites you! You die of a grue bite.");
            }
        } else if (action.equals("go to the house")) { 
            System.out.println("You approach the house and it is falling apart.");
            System.out.println("You can tear down the door and enter");
            System.out.println("Enter?");
            action = myScanner.nextLine();
            
            if (action.equals("enter")) {
                System.out.println("You enter the disheveld house and find blood stains everywhere.");
                System.out.println("Do you go deeper into the house or run away screaming?");
                System.out.println("go in further or run away screaming?");
                action = myScanner.nextLine();
                
                if (action.equals("go in further")){
                    System.out.println("You go in further and get stabbed in the back, why would you explore a house like this?");
                } else if (action.equals("run away screaming")){
                    System.out.println("You feel like a coward but your life has been spared.");
                }
            }
        } else if (action.equals("go to the chest")){
            System.out.println("You go to the chest and notice it is unlocked as you approach.");
            System.out.println("You can open it and peer inside or stick your hand inside.");
            System.out.println("Peer inside, or stick your hand inside?");
            action = myScanner.nextLine();
            
            if (action.equals("peer inside")){
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = myScanner.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
            } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
            } else if (action.equals("stick your hand in")) {
                System.out.print("You feel something hairy..it bites you! You die of a grue bite.");
            }
            }
        }
    }
}



