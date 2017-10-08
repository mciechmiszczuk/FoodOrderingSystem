package OrderSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodOrder {

    public static void main(String[] args) {


        List<FoodInterface> dishesOrder = new ArrayList<>();

        System.out.println("Do you want to add new type of cusine?");

        Scanner scanner = new Scanner(System.in);
        String newCusine = scanner.nextLine();

        if (newCusine.equals("yes")) {
            System.out.println("Please enter name of new type of cusine");
            String newNameOfCusine = scanner.nextLine();

            /*
            * TODO: Add new type of cusine to database
            * */

        }
        else {
            System.out.println("So, we start ordering");
            System.out.println("Please enter name of cusine");
        }
        String cusineOrder = scanner.nextLine();

        System.out.println("Do you want to order a meal?");
        String mealOrder = scanner.nextLine();

        if (mealOrder.equals("yes")) {
            System.out.println("What meal do you want to order?");
            String meal = scanner.nextLine();
            dishesOrder.add(getMealOrder(meal));
        }

        System.out.println("Do you want to order a drink?");
        String drinkOrder = scanner.nextLine();

        if (drinkOrder.equals("yes")) {
            System.out.println("What drink do you want to order?");
            String drink = scanner.nextLine();
            dishesOrder.add(getDrinkOrder(drink));

            System.out.println("Would you like to add some ice cubes to your drink?");
            String iceCubesOrder = scanner.nextLine();

                   /* TODO:
                     if (iceCubesOrder.equals("yes")) {
                        dishesOrder.add(getIceOrder(iceCubes));
                        return;*/
        }

        System.out.println("Do you want to order a dessert?");
        String dessertOrder = scanner.nextLine();

        if (dessertOrder.equals("yes")) {
            System.out.println("What dessert do you want to order?");
            String dessert = scanner.nextLine();
            dishesOrder.add(getDessertOrder(dessert));
        }
        System.out.println("OK, I have all your order. Thank you. Price will be calculated.");

        /*
        TODO: Calculate sum and get price of order
         */

    }

    private static FoodInterface getDessertOrder(String dessert) {
        return null;
    }

    private static FoodInterface getDrinkOrder(String drink) {
        return null;
    }

    private static FoodInterface getMealOrder(String meal) {
        return null;
    }

}

