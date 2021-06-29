import java.util.Scanner;

import entities.Estoque;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nEnter product data:");
        System.out.print("Name: ");
        String name = ler.nextLine();
        System.out.print("Price: ");
        double price = ler.nextDouble();
        System.out.print("Quantity in Stock: ");
        int quantity = ler.nextInt();
        Estoque product = new Estoque(name, quantity, price);

        System.out.println(product);
    
        System.out.print("\nEnter the number of products to be added in stock: ");
        quantity = ler.nextInt();
        product.AddProducts(quantity);
        System.out.println(product);
        
        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = ler.nextInt();
        product.RemoveProducts(quantity);
        System.out.println(product);
        ler.close();
    }
}