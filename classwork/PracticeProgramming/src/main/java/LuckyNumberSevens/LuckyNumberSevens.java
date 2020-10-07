/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuckyNumberSevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class LuckyNumberSevens {
    public static void main(String[] args) {
        
        Random rand = new Random(); 
        

        int numberOfRolls = 0;
        int maxMoney = 0;
        int maxMoneyRolls = 0;
        int money = readValue("How many dollars do you have?");
        
        while(money > 0){
            if(maxMoney < money){
                maxMoney = money;
                maxMoneyRolls = numberOfRolls;
            }
            int rollOne = rand.nextInt(6)+1;
            int rollTwo = rand.nextInt(6)+1;
            int diceSum = rollOne + rollTwo;
            if(diceSum == 7){
                money += 4;
            } else { money -= 1;}
            numberOfRolls ++;
        }
        
        
        System.out.println("You went broke after " + numberOfRolls + " rolls.");
        System.out.println("You should have quit after " + maxMoneyRolls + " rolls when you had " + maxMoney);
        

        
    }
        public static int readValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        // print prompt to console
        System.out.println(prompt);
        // read value into String data type
        String input = sc.nextLine();
        // convert the String to a float
        int number = Integer.parseInt(input);
        // return the float value
        return number;
        }
}
