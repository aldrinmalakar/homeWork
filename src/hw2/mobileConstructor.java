package hw2;

public class mobileConstructor {
    String companyName;
    String modelName;
    int memorySize;
    int batteryCapacity;

    public mobileConstructor(String companyName, String modelName, int memorySize, int batteryCapacity){

        this.companyName = companyName;
        this.modelName = modelName;
        this.memorySize = memorySize;
        this.batteryCapacity = batteryCapacity;


        System.out.println("Oh so you got jokes now?");
        System.out.println("You wanna know what I used back in the old days when I was your age?");
        System.out.println("I had a brick phone build by "+ companyName+ "-"+modelName+ " with a "+memorySize+"GB ssd storage and it only had battery for "+batteryCapacity+" hours.");
        System.out.println("And this concludes my learning of object, constructor, method and importing class. Peace out!!");
    }
}
