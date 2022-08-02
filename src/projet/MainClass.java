package projet;

import java.util.Scanner;

public class MainClass {

    public static void main(String args[]) {


        // exemple reservation d'une tableCouple avec une vue de mer

        ReservationTable res = new VueDeMer(new TableFamilial());
        System.out.println( "existe-t-il une table vide ?  "+res.reserver());  // affiche true si reservation possible ( disponibilité)
        System.out.println(res.prixReservation());  // affiche le prix final ( dans ce cas d'une tableCouple avec vu de mer)



        /*

        */



        // coffee prepare
        Tea tea = new Tea();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        Coffee café = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();

        System.out.println("\nMaking coffée simple");
        café.prepareRecipe();

        //ice cream prepare

        System.out.println("Enter your choice of ice cream");
        System.out.println("1-vanilla, 2- strawberry, 3- chocolate, 4- exit");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        System.out.println("\n Enter your choice of toppings");
        String topping = scanner.nextLine();

        IceCream iceCream = null;
        while(!type.equalsIgnoreCase("4")) {
            iceCream = IceCreamFactory.getInstance(type);
            iceCream.setToppings(topping);
            iceCream.prepare();

            System.out.println("\n Enter your choice of ice cream again");
            type = scanner.nextLine();
            if(!type.equalsIgnoreCase("4") ) {
                System.out.println("\n Enter your choice of toppings again");
                topping = scanner.nextLine();
            }
        }
        System.out.println("\nThank You ");
    }
}
