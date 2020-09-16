package hw2;

public class mainMethodInitialized {

    public mainMethodInitialized(){
        System.out.println("Welcome to my homework 2");
        System.out.println("Here is the main method, and I am importing the constructors from other classes in here.");
        System.out.println("Enjoy your stay, and constructive critisism is highly appreciated");
        System.out.println("####################################################################");
        System.out.println();
        System.out.println();

    }


    public static void main(String[] args) {

        //Header for the console
        mainMethodInitialized header = new mainMethodInitialized();

        // This is the execution for Pizza constructor class.
        pizzaConstructor newPizza = new pizzaConstructor("Italian",'M',4,20);

        //This is the execution of Computer constructor class
        computerConstructor newPC = new computerConstructor("Alienware",500,"AMD A10",16);

        //This is the execution of Car constructor class
        carConstructor wheelBarrow = new carConstructor("Mercedes","cClass",2019,"class1");

        //This is the execution of Mobile constructor class
        mobileConstructor brickPhone = new mobileConstructor("Xiaomi","MI8",128,23);
    }
}
