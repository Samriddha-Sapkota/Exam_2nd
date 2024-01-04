package Models;

import java.util.Arrays;

public class Tshirt {
     //Initializing the variables;
     String itemName;
     String productCode;
     int price = 1235;
     String brand;
     String description;
     String[] sizes;

     //Generating a constructor.
     public Tshirt(java.lang.String itemName, java.lang.String productCode, int price, java.lang.String brand, java.lang.String description, java.lang.String[] sizes) {
          this.itemName = itemName;
          this.productCode = productCode;
          this.price = price;
          this.brand = brand;
          this.description = description;
          this.sizes = sizes;
     }

     //Generating Getter and Setter.
     public java.lang.String getItemName() {
          return itemName;
     }

     public void setItemName(java.lang.String itemName) {
          this.itemName = itemName;
     }

     public java.lang.String getProductCode() {
          return productCode;
     }

     public void setProductCode(java.lang.String productCode) {
          this.productCode = productCode;
     }

     public int getPrice() {
          return price;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     public java.lang.String getBrand() {
          return brand;
     }

     public void setBrand(java.lang.String brand) {
          this.brand = brand;
     }

     public java.lang.String getDescription() {
          return description;
     }

     public void setDescription(java.lang.String description) {
          this.description = description;
     }

     public java.lang.String[] getSizes() {
          return sizes;
     }

     public void setSizes(java.lang.String[] sizes) {
          this.sizes = sizes;
     }

     //A function/method that describes the T-shirt.
     public void shirt_info(){
         String itemName = this.itemName;
         String productCode = this.productCode;
         int price = this.price;
         String brand = this.brand;
         String description = this.description;
         String[] sizes = this.sizes;

         //Printing the T-shirt's details.
         System.out.println("Item Name: " + itemName);
         System.out.println("Description: " + description);
         System.out.println("Brand: " + brand);
         System.out.println("Product Code: " + productCode);
         System.out.println("Price: " + price);
         System.out.println("Sizes: " + Arrays.toString(sizes));
     }

}
