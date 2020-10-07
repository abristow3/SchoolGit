/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise7;

/**
 *
 * @author Alex
 */
public class DifferentKettleOfFish {
    public static void main(String[] args) {
        
        int fish = 1;
        
        for(int i = 0; i < 10; i++){
            if(fish == 3){
                System.out.println("Red fish");
            } else if (fish == 4){
                System.out.println("blue fish");
            } else {
                System.out.println(fish + " fish");
            }
            fish ++;
        }
        
        
        
    }
}
