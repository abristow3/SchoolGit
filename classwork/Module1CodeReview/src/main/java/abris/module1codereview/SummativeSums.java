/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abris.module1codereview;

/**
 *
 * @author Alex
 */
public class SummativeSums {
    public static void main(String[] args) {
        
        int array1[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int array2[] = { 999, -60, -77, 14, 160, 301 };
        int array3[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
                         140, 150, 160, 170, 180, 190, 200, -99 };
         
        int sum1 = arraySums(array1);
        int sum2 = arraySums(array2);
        int sum3 = arraySums(array3);
        
        System.out.println("#1 Array Sum: " + sum1);
        System.out.println("#1 Array Sum: " + sum2);
        System.out.println("#1 Array Sum: " + sum3);
        
    }
    
    public static int arraySums(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = array[i] + sum; 
        }
        return sum;
    }
}
