
package switchcaseresturant;
import java.util.Scanner;

public class SwitchcaseResturant {


    public static void main(String[] args) {
        
        Scanner probe = new Scanner (System.in);
        //SwitchCase determinate variables
        int drinks;
        int breakfast;
        int lunch;
        int supper;
        int snack;
        
        //String display name Variables
        String drinkString;
        String breakfastString;
        String lunchString;
        String supperString;
        String snackString;
        
        //Money Variables
        int drinkcost;
        int breakfastcost;
        int lunchcost;
        int suppercost;
        int snackcost;
        int totalsilver;
        int totalgold;
        
        //Drink Menu portion
        System.out.println("Welcome to The Tavern: the place where the mystic becomes reality");
        System.out.println("We are happy to serve you today, please order when you are ready.");
        System.out.println("");
        System.out.println("<-------------------- Drinks -------------------->");
        System.out.println("(1)-Dragon's fire **************** 9 Silver Pieces");
        System.out.println("(2)-Drunkard's Ale *************** 8 Silver Pieces");
        System.out.println("(3)-Thieve's Guild Grog ********** 7 Silver Pieces");
        System.out.println("(4)-Trader's Wine***************** 6 Silver Pieces");
        System.out.println("(5)-Oger's Mead ****************** 4 Silver Pieces");
        System.out.println("(6)-Piratier's Rum *************** 3 Silver Pieces");
        System.out.println("(7)-Dragon Berry Juice *********** 1 Silver Pieces");
        System.out.println("(8)-Water *********************************** free");
        System.out.println("(9)-Nothing ********************************* free");
        System.out.println("<------------------------------------------------>");
        System.out.println("");
        System.out.println("What would you like to drink today?");
        drinks = probe.nextInt();
        
        //SwitchCase menu begins
        switch(drinks){
            case 1: drinkString = "Dragon's Fire";
                break;
            case 2: drinkString = "Drunkard's Ale";
                break;
            case 3: drinkString = "Thieve's Guild Grog";
                break;
            case 4: drinkString = "Trader's Wine";
                break;
            case 5: drinkString = "Oger's Mead";
                break;
            case 6: drinkString = "Piratier's Rum";
                break;
            case 7: drinkString = "Dragon Berry Juice";
                break;
            case 8: drinkString = "Water";
                break;
            default: drinkString = "nothing";
                break;
        }
        
        //SwitchCase Drink Cost
        switch(drinks){
            case 1: drinkcost = 9;
                break;
            case 2: drinkcost = 9;
                break;
            case 3: drinkcost = 7;
                break;
            case 4: drinkcost = 6;
                break;
            case 5: drinkcost = 4;
                break;
            case 6: drinkcost = 3;
                break;
            case 7: drinkcost = 1;
                break;
            default: drinkcost = 0;
                break;
        }
        
        //Breakfast menu
        System.out.println("");
        System.out.println("<------------------- Breakfast ------------------>");
        System.out.println("(1)-The Mighty Millet ************** 2 Gold Pieces");
        System.out.println("      -Includes: Kippers, Goose eggs, Strawberries");
        System.out.println("                 Quail eggs, and Millet");
        System.out.println("(2)-The Slayer's Breakfast ********* 2 Gold Pieces");
        System.out.println("      -Includes: Beef steak, Chicken eggs, Melon");
        System.out.println("                 Duck eggs, and Coarse rye bread.");
        System.out.println("(3)-Swallower's Revenge ************* 1 Gold Piece");
        System.out.println("      -Includes: Shark fillet, curds, chicken eggs");
        System.out.println("                 Melon and Corn pone.");
        System.out.println("(4)-Egg-men's Rise ****************** 1 Gold Piece");
        System.out.println("      -Includes: Bulette fin, Quail eggs, Oatmeal");
        System.out.println("                 Melon and Duck eggs.");
        System.out.println("(5)-Nothing ********************************* free");
        System.out.println("<------------------------------------------------>");
        System.out.println("");
        System.out.println("What would you like for breakfast today?");
        breakfast = probe.nextInt();
        
        //SwitchCase breakfast menu begins
        switch(breakfast){
            case 1: breakfastString = "The Mighty Millet";
                break;
            case 2: breakfastString = "The Slayer's Breakfast";
                break;
            case 3: breakfastString = "Swallower's Reveng";
                break;
            case 4: breakfastString = "Egg-men's Rise";
                break;
            default: breakfastString = "nothing";
                break;
        }
        
        //SwitchCase Breakfast Cost
        switch(breakfast){
            case 1: breakfastcost = 2;
                break;
            case 2: breakfastcost = 2;
                break;
            case 3: breakfastcost = 1;
                break;
            case 4: breakfastcost = 1;
                break;
            default: breakfastcost = 0;
                break;
        }
        
        //Lunch menu
        System.out.println("");
        System.out.println("<--------------------- Lunch -------------------->");
        System.out.println("(1)-Hunter's Call ****************** 3 Gold Pieces");
        System.out.println("      -Includes: Veal Sweetbreads, Blackberries");
        System.out.println("                 Spinach, and Quail eggs.");
        System.out.println("(2)-Dragon's Meal ****************** 2 Gold Pieces");
        System.out.println("      -Includes: Lamb stew, Dragon turtle omelet");
        System.out.println("                 Onions, and Blackberries.");
        System.out.println("(3)-Beggar's Hope ****************** 2 Gold Pieces");
        System.out.println("      -Includes: Sausage, Soft cheese, Taro and");
        System.out.println("                 Blackberries.");
        System.out.println("(4)-Farmer's Pick ****************** 2 Gold Pieces");
        System.out.println("      -Includes: Pork chop, Assassin vine leaf");
        System.out.println("                 Sharp cheese, and Strawberries.");
        System.out.println("(5)-Nothing ********************************* free");
        System.out.println("<------------------------------------------------>");
        System.out.println("");
        System.out.println("What would you like for breakfast today?");
        lunch = probe.nextInt();
        
        //SwitchCase Lunch menu begins
        switch(lunch){
            case 1: lunchString = "Hunter's Call";
                break;
            case 2: lunchString = "Dragon's Meal";
                break;
            case 3: lunchString = "Beggar's Hope";
                break;
            case 4: lunchString = "Farmer's Pick";
                break;
            default: lunchString = "nothing";
                break;
        }
        
        //SwitchCase Lunch Cost
        switch(lunch){
            case 1: lunchcost = 3;
                break;
            case 2: lunchcost = 2;
                break;
            case 3: lunchcost = 2;
                break;
            case 4: lunchcost = 2;
                break;
            default: lunchcost = 0;
                break;
        }
        
        //Supper menu
        System.out.println("");
        System.out.println("<-------------------- Supper -------------------->");
        System.out.println("(1)-Adventurous Forester *********** 4 Gold Pieces");
        System.out.println("      -Includes: Monkey brain, Turnips, Fruitcake");
        System.out.println("                 Tahini and Taro.");
        System.out.println("(2)-Humble Traveler **************** 3 Gold Pieces");
        System.out.println("      -Includes: Beef steak, Cabbage, Chick peas");
        System.out.println("                 Flatbread and Custard");
        System.out.println("(3)-Sailor's Bounty **************** 2 gold peices");
        System.out.println("      -Includes: Pork liver, Mince pie, Chick peas");
        System.out.println("                 Green beans, and Centaur rye.");
        System.out.println("(4)-Romantic Meal ****************** 2 Gold Peices");
        System.out.println("      -Includes: Octopus, Yams, Coarse rye bread");
        System.out.println("                 Collard greens, and Walnut cake.");
        System.out.println("(5)-Nothing ********************************* free");
        System.out.println("<------------------------------------------------>");
        System.out.println("");
        System.out.println("What would you like for breakfast today?");
        supper = probe.nextInt();
        
        //SwitchCase Supper menu begins
        switch(supper){
            case 1: supperString = "Adventurous Forester";
                break;
            case 2: supperString = "Humble Traveler";
                break;
            case 3: supperString = "Sailor's Bounty";
                break;
            case 4: supperString = "Romantic Meal";
                break;
            default: supperString = "nothing";
                break;
        }
        
        //SwitchCase Supper Cost
        switch(supper){
            case 1: suppercost = 4;
                break;
            case 2: suppercost = 3;
                break;
            case 3: suppercost = 2;
                break;
            case 4: suppercost = 2;
                break;
            default: suppercost = 0;
                break;
        }
        
        //Snack menu
        System.out.println("");
        System.out.println("<--------------------- Snack -------------------->");
        System.out.println("(1)-Healthy Nibble ************** 10 Silver Pieces");
        System.out.println("      -Includes: Sharp Cheese, Wild Rice, and");
        System.out.println("                 Corn pone");
        System.out.println("(2)-Gnomian Surprise ************* 8 Silver Pieces");
        System.out.println("      -Includes: Goblin Bannock, Stewed Prunes and");
        System.out.println("                 Goose eggs.");
        System.out.println("(3)-Drunkard's Cure ************** 8 Silver Pieces");
        System.out.println("      -Includes: Applesauce, Currants, and Mush");
        System.out.println("(4)-Love Recipe ****************** 8 Silver Pieces");
        System.out.println("      -Includes: Griffin-milk Cheese, Strawberries");
        System.out.println("                 and Nut bread.");
        System.out.println("(5)-Nothing ********************************* free");
        System.out.println("<------------------------------------------------>");
        System.out.println("");
        System.out.println("What would you like for breakfast today?");
        snack = probe.nextInt();
        
        //SwitchCase Snack menu begins
        switch(snack){
            case 1: snackString = "Healthy Nibble";
                break;
            case 2: snackString = "Gnomian Surprise";
                break;
            case 3: snackString = "Drunkard's Cure";
                break;
            case 4: snackString = "Love Recipe";
                break;
            default: snackString = "nothing";
                break;
        }
        
        //SwitchCase Drink Cost
        switch(snack){
            case 1: snackcost = 10;
                break;
            case 2: snackcost = 8;
                break;
            case 3: snackcost = 8;
                break;
            case 4: snackcost = 8;
                break;
            default: snackcost = 0;
                break;
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("<-------------------- Recipt -------------------->");
        System.out.println("|                                                |");
        System.out.println("| -Your Drink was: " +drinkString+ " it costed: " +drinkcost+ "Silver Pieces |");
        
    }
    
}
