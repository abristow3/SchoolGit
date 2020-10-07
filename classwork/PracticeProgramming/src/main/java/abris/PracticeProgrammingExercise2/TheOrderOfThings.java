/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abris.PracticeProgrammingExercise2;

/**
 *
 * @author Alex
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;
        
        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "martian";
        material = "platinum";
        purpose = "good";
        
        noun = "dragons"; 
        
        //using the 9 with strings doesn't add -- it concatenates! (sticks them together)
        
        System.out.println(number + " " + opinion + " " + age + " " + 
                shape + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);    
                
                }
} 
