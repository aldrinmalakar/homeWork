package hw2;

public class carConstructor {

    String  makerName;
    String  modelName;
    int     modelYear;
    String  trimLevel;

    //defining the constructor
    public carConstructor(String makerName, String modelName, int modelYear, String trimLevel){
        this.makerName = makerName;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.trimLevel = trimLevel;

        System.out.println("You scrolled enough to see some boring stuff on car class by now, anyway!!!");
        System.out.println("My friend has a "+makerName+" "+modelName+" "+modelYear+" "+trimLevel+".");
        System.out.println("Happy now?");
        System.out.println();
        System.out.println();


    }

}
