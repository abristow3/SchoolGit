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
public class TriviaNight {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int userAnswer1;
        int userAnswer2;
        int userAnswer3;
        int userTotalScore = 0;
        
        
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println("FIRST QUESTION!");
        System.out.println();
        System.out.println("Which of these animals walks on four legs?");
        System.out.println("1)Bird  2)dog  3)kangaroo  4)fish");
        userAnswer1 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Your answer: " + userAnswer1);
        if(userAnswer1 == 1 || userAnswer1 == 3 || userAnswer1 == 4){
            System.out.println("That answer is wrong! Your current score is:" + userTotalScore);
        } else if(userAnswer1 == 2){
            userTotalScore ++;
            System.out.println("That is correct! Your current score is: " + userTotalScore);
        }
        System.out.println();
        System.out.println("Which of these is a dog breed?");
        System.out.println("1)Standard Poodle  2)Yorkie McDoodle  3)mini mutt  4)Tiny Gold");
        userAnswer2 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Your answer: " + userAnswer2);
        if(userAnswer2 == 2 || userAnswer2 == 3 || userAnswer2 == 4){
            System.out.println("That answer is wrong! Your current score is:" + userTotalScore);
        } else if(userAnswer2 == 1){
            userTotalScore ++;
            System.out.println("That is correct! Your current score is: " + userTotalScore);
        }
        System.out.println();
        System.out.println("Which state is the biggest?");
        System.out.println("1)Deleware  2)Nevada  3)Montana 4)Texas");
        userAnswer3 = Integer.parseInt(myScanner.nextLine());
        System.out.println("Your answer: " + userAnswer3);
        if(userAnswer3 == 1 || userAnswer3 == 2 || userAnswer3 == 3){
            System.out.println("That answer is wrong! Your current score is:" + userTotalScore);
        } else if(userAnswer3 == 4){
            userTotalScore ++;
            System.out.println("That is correct! Your current score is: " + userTotalScore);
        }
        System.out.println();
        if(userTotalScore == 0){
            System.out.println("You didn't answer any questions right...go study!");
        } else if(userTotalScore == 1){
            System.out.println("You only got one answer right...you should try again");
        } else if(userTotalScore == 2){
            System.out.println("You got 2 answers correct, that's not terrible.");
        } else if(userTotalScore == 3){
            System.out.println("You answered them all correct, you are a TRIVIA GOD");
        }
    }
}
