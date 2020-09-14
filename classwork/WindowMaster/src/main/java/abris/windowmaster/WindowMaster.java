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
        String stringHeight;
        String stringWidth;
        String stringWindowCostPerSquareFoot;
        String stringTrimPerFootCost;
        String stringNumberOfWindows;
        float areaOfWindow;
        float costPerWindow;
        float peremeterOfWindow;
        float trimPerFootCost;
        float windowCostPerSquareFoot;
        float totalCostOfTrim;
        float totalCostOfWindowArea;
        float numberOfWindows;
        float totalCost;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the number of windows: ");
        stringNumberOfWindows = myScanner.nextLine();
        System.out.println("Please enter window Height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window Width: ");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter your cost per square foot ");
        stringWindowCostPerSquareFoot = myScanner.nextLine();
        System.out.println("Please enter your cost per linear foot of trim ");
        stringTrimPerFootCost = myScanner.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        windowCostPerSquareFoot = Float.parseFloat(stringWindowCostPerSquareFoot);
        trimPerFootCost = Float.parseFloat(stringTrimPerFootCost);
        numberOfWindows = Float.parseFloat(stringNumberOfWindows);

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
}
