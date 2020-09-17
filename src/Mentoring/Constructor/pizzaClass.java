package Mentoring.Constructor;

public class pizzaClass {
    String pizzaName;
    char pizzaSize;
    int qty;
    double price;

    public pizzaClass (String pizzaName, char pizzaSize, int qty, double price){

        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.qty = qty;
        this.price = price;
        double totalPrice = price * qty;
        System.out.println("In this block I am demonstrating the pizza constructor class");
        System.out.println();
        System.out.println("Customer ordered " + pizzaName + " pizza, size " + pizzaSize + " purchasing "+ qty + " pizza(s) for "+ totalPrice+ " dollars.");
        System.out.println();
        System.out.println("End of pizzaClass");
        System.out.println();
    }
}
