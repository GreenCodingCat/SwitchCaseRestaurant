
package switchcaseresturant;
import java.util.Scanner;

public class SwitchcaseResturant {


    public static void main(String[] args) {
        
        Scanner probe = new Scanner (System.in);
        //SwitchCase determinate variables
        int drinks;
        int appetizer;
        int soup;
        int entree;
        int desserts;
        
        //String display name Variables
        String drinkString;
        String appString;
        String soupString;
        String entString;
        String dessertString;
        
        //Money Variables
        double drinkcost;
        double appcost;
        double soupcost;
        double entcost;
        double dessertcost;
        double totalcost;
        double tip;
        double tax;
        
        //words
        System.out.println("Welcome to the Fictionary Dictionary resturant.");
        System.out.println("We are happy to serve you today, please order when you are ready.");
        System.out.println("");
        System.out.println("<-------------- Drinks -------------->");
        System.out.println("(1)-Dithelean Ale ************** $5.00");
        System.out.println("(2)-Dreamer's Wine ************* $7.00");
        System.out.println("(3)-Nexian pop ***************** $2.50");
        System.out.println("(4)-Lemonade ******************* $1.50");
        System.out.println("(5)-Water ********************** $0.00");
        System.out.println("(6)-Nothing ******************** $0.00");
        System.out.println("<------------------------------------>");
        System.out.println("");
        System.out.println("What would you like to drink today?");
        drinks = probe.nextInt();
        
        //SwitchCase menu begins
        switch(drinks){
            case 1: drinkString = "Dithelean Ale";
                break;
            case 2: drinkString = "Dreamer's Wine";
                break;
            case 3: drinkString = "Nexian pop";
                break;
            case 4: drinkString = "Lemonade";
                break;
            case 5: drinkString = "Water";
                break;
            case 6: drinkString = "nothing";
                break;
        }
        
        switch(drinks){
            case 1: drinkcost = 5.00;
                break;
            case 2: drinkcost = 7.00;
                break;
            case 3: drinkcost = 2.50;
                break;
            case 4: drinkcost = 1.50;
                break;
            default: drinkcost = 0.00;
                break;
        }
        
        System.out.println("");
        System.out.println("<------------ Appetizers ------------>");
        System.out.println("(1)-Mozzerella Sticks ********** $7.50");
        System.out.println("(2)-Shrimp Poppers ************* $8.99");
        System.out.println("(3)-Meal Worms ***************** $6.25");
        System.out.println("(4)-Insect Plater ************** $3.99");
        System.out.println("(5)-Bread and Cheese *********** $3.99");
        System.out.println("(6)-Nothing ******************** $0.00");
        System.out.println("<------------------------------------>");
        System.out.println("");
        System.out.println("What would you like for an appetizer today?");
        appetizer = probe.nextInt();
        
        //SwitchCase menu appetizers
        switch(appetizer){
            case 1: appString = "Mozzerella Sticks";
                break;
            case 2: appString = "Shrimp Poppers";
                break;
            case 3: appString = "Nexian pop";
                break;
            case 4: appString = "Lemonade";
                break;
            case 5: appString = "Water";
                break;
            case 6: appString = "nothing";
                break;
        }
        
    }
    
}
