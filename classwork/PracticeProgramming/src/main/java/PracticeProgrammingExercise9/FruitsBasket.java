/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeProgrammingExercise9;

/**
 *
 * @author Alex
 */
public class FruitsBasket {
    public static void main(String[] args) {
        
              String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;  
        
        for( int i = 0; i < fruitBasket.length; i++){
            if(fruitBasket[i] == "Orange" ){
                numOranges++;
            } else if(fruitBasket[i] == "Apple"){
                numApples++;
            } else numOtherFruit++;
            
            
        }
        
        System.out.println("Total# of fruit in basket: " + (numOranges + numApples + numOtherFruit));
        System.out.println("Number of apples: " + numApples);
        System.out.println("Number of oranges: " + numOranges);
        System.out.println("Number of other fruits: " + numOtherFruit);
        
    }
}
