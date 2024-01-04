package Models;

import java.util.Arrays;

public class Order {
    String name;
    int phoneNumber;
    int [] items;
    int [] price;

    //Generating Constructor.
    public Order(String name, int phoneNumber, int[] items, int[] price) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.price = price;
    }

    //Generating Getter and Setter.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    //Generating a function to print the order details.
    public void order_info(){
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Items : " + Arrays.toString(items));
        int totalPrice = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] == 572) {
                totalPrice += 1235;
            } else if (items[i] == 661) {
                totalPrice += 1165;
            } else if (items[i] == 348) {
                totalPrice += 1832;
            } else {
                System.out.println("Invalid Item Code for item at index " + i);
            }
        }

        System.out.println("Price before VAT: " + totalPrice);

        double vatRate = 0.13;
        double vatAmount = totalPrice * vatRate;
        double totalPriceWithVAT = totalPrice + vatAmount;

        System.out.println("Total Price with VAT: " + totalPriceWithVAT);
    }
}

