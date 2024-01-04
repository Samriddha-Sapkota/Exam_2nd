import Models.Order;
import Models.Tshirt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //First T-shirt object.
        Tshirt t1 = new Tshirt("Gorkhali Batman","572", 1235, " Karuna", "Graphic text: You either die a hero or live long enough to see yourself be a villain.", new java.lang.String[]{"XL, Medium, Large"});

        //Second T-shirt object.
        Tshirt t2 = new Tshirt("Kathmaduli Batman","661", 1165, "Evo Store", "Graphic text: Every night I disappear cause Kathmandu needs me.", new java.lang.String[]{"XL, Medium, Large"});

        //Third T-shirt object.
        Tshirt t3 = new Tshirt("Pokhreli Batman","348", 1832, "Brocade", "Graphic text: Pokhara here I come.", new java.lang.String[]{"XL, Medium, Large"});
        //Printing the details from the function in T-shirts models.
        System.out.println("\t\tT-shirt1 Information");
        t1.shirt_info();
        System.out.println("\n\t\tT-shirt2 Information");
        t2.shirt_info();
        System.out.println("\n\t\tT-shirt3 Information");
        t3.shirt_info();

        //Setting up Scanner to take input from the user to take the orders.
        Scanner sc = new Scanner(System.in);
        //Asking user for their name.
        System.out.println("Enter your name : ");
        String userName = sc.nextLine();

        System.out.println("Enter your phone number : ");
        int ph = sc.nextInt();

        //Checking if the given phone number is valid or not.
        if (String.valueOf(ph).length() > 10){
            System.out.println("Invalid Phone Number. Please provide a valid phone number. ");
            return;
        }

        System.out.println("Enter the items code you want to order : ");
        int[] orderedItems = new int[]{sc.nextInt()};

        Order o1 = new Order(userName, ph, orderedItems, new int[]{});
        Order o2 = new Order(userName, ph, orderedItems, new int[]{});
        Order o3 = new Order(userName, ph, orderedItems, new int[]{});

        //Printing the order details.
        System.out.println("\t\tOrder1 Information");
        o1.order_info();
        System.out.println("\n\t\tOrder2 Information");
        o2.order_info();
        System.out.println("\n\t\tOrder3 Information");
        o3.order_info();
    }
}
