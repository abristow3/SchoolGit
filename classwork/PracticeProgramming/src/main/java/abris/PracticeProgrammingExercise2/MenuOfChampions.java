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
public class MenuOfChampions {
    public static void main(String[] args) {
        
      String dividers1, dividers2, dividers3, foodname1, foodname2, foodname3;
      double foodprice1, foodprice2, foodprice3;
      
      
      dividers1 = "  __  __  __  __  __  __  __  __  __  __  __  __  __  __  __  __";
      dividers2 = "  )(  )(  )(  )(  )(  )(  )(  )(  )(  )(  )(  )(  )(  )(  )(  )(";
      dividers3 = " (__)(__)(__)(__)(__)(__)(__)(__)(__)(__)(__)(__)(__)(__)(__)(__)";
      foodname1 = "Wings";
      foodname2 = "Pizza";
      foodname3 = "Hotdog";
      foodprice1 = 2.50;
      foodprice2 = 3.50;
      foodprice3 = 1.50;
      
      System.out.println(dividers1);
      System.out.println(dividers2);
      System.out.println(dividers3);
      System.out.println();
      
      System.out.println("WELCOME TO RESTARAUNT NIGHT VALE!");
      System.out.println("Today's menu is...");
      
      System.out.println(dividers1);
      System.out.println(dividers2);
      System.out.println(dividers3);
      System.out.println();
      
      System.out.println("$" + foodprice1 + " ***" + foodname1);
      System.out.println("$" + foodprice2 + " ***" + foodname2);
      System.out.println("$" + foodprice3 + " ***" + foodname3);
      

    }
}
