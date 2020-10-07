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
public class FruitSalad {
    public static void main(String[] args) {
        
        int orange = 0;
        int apple = 0;
        int count = 0;
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato",
            "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato",
            "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];

        for(int i = 0; i < fruit.length; i++)
            if(count < 12){
              if(fruit[i].contains("berry")){
                fruitSalad[count] = fruit[i];
                count++;
              } else if(fruit[i].contains("Apple") && apple < 3){
                  fruitSalad[count] = fruit[i];
                  apple++;
                  count++;
              } else if(fruit[i].contains("Orange") && orange < 2){
                  fruitSalad[count] = fruit[i];
                  orange++;
                  count++;
              } else if(!fruit[i].contains("Tomato")){
                  fruitSalad[count] = fruit[i];
                  count++;
              }  
            }
        
        for(int i = 0; i < fruitSalad.length; i++){
        System.out.print(fruitSalad[i] + ", ");
        }

    }
}
