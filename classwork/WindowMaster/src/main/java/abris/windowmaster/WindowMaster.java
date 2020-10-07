/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abris.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class WindowMaster {
    public static void main(String [] args) {
        
        float height;
        float width;
        float areaOfWindow;
        float costPerWindow;
        float peremeterOfWindow;
        float trimPerFootCost;
        float windowCostPerSquareFoot;
        float totalCostOfTrim;
        float totalCostOfWindowArea;
        float numberOfWindows;
        float totalCost;
        
        Scanner sc = new Scanner(System.in);
        numberOfWindows = readValue("Please enter the number of windows: ");
        height = readValue("Please enter window Height: ");
        width = readValue("Please enter window Width: ");
        windowCostPerSquareFoot = readValue("Please enter your cost per square foot ");
        trimPerFootCost = readValue("Please enter your cost per linear foot of trim ");

        areaOfWindow = height * width;
        peremeterOfWindow = (height + width) * 2;
        totalCostOfTrim = trimPerFootCost * peremeterOfWindow;
        totalCostOfWindowArea = windowCostPerSquareFoot * areaOfWindow;
        costPerWindow = totalCostOfTrim + totalCostOfWindowArea;
        totalCost = costPerWindow * numberOfWindows;
        
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Total area: " + areaOfWindow);
        System.out.println("Peremeter: " + peremeterOfWindow);
        System.out.println("The cost of your trim per foot: " + trimPerFootCost);
        System.out.println("The cost of your window sq/ft: " + windowCostPerSquareFoot);
        System.out.println("The cost per window will be: " + costPerWindow);
        System.out.println("Your total cost: " + totalCost);
        
    }
    
        public static float readValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        // print prompt to console
        System.out.println(prompt);
        // read value into String data type
        String input = sc.nextLine();
        // convert the String to a float
        float floatVal = Float.parseFloat(input);
        // return the float value
        return floatVal;
    }
}
