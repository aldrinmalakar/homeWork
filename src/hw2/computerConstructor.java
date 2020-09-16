package hw2;

public class computerConstructor {

    String  computerType;
    double  hddSpace;
    String  processorModel;
    int    ramSize;

    public computerConstructor(String computerType, double hddSpace, String processorModel, int ramSize){
        System.out.println("Now we are looking into the computer constructor class!");
        this.computerType   = computerType;
        this.hddSpace       = hddSpace;
        this.processorModel = processorModel;
        this.ramSize        = ramSize;
        System.out.println("I just bought a "+ computerType+" with " + hddSpace+" that has " +processorModel+" & "+ramSize+".");
        System.out.println("And, this is the end of computer constructor class");
        System.out.println();
        System.out.println();
    }


}
