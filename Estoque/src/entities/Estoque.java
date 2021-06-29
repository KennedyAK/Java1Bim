package entities;

public class Estoque{
    private String name;
    private int quantity;
    private double price;

    public Estoque(String name, int quantity, double price){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(double price, int quantity){
        return price * quantity;
    }

    
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }
    
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "\nProduct data: " + name + ", $ " + price + ", " + quantity + " units, Total: $" + totalValueInStock(price, quantity);
    }
}