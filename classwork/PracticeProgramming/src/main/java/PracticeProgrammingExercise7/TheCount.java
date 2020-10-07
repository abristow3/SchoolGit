/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise7;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class TheCount {
    public static void main(String[] args) {
        
        int start;
        int end;
        int countBy;
        int count = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU!");
        System.out.println("Start at: ");
        start = Integer.parseInt(input.nextLine());
        System.out.println("End at: ");
        end = Integer.parseInt(input.nextLine());
        System.out.println("Count by: ");
        countBy = Integer.parseInt(input.nextLine());
        
        for(int i = start; i < end + 1; i = i + countBy){
            System.out.print(i + " ");
            count ++;
            if(count == 3){
                System.out.print(" Ah Ah Ah!");
                System.out.println("");
                count = 0;
            }
        }

    }
}
