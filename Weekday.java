import java.rmi.dgc.Lease;
import java.util.Scanner;

public class Weekday {
    enum Level {
        Sunday,
        monday,
        thusday,
        wednesday,
        thursday,
        friday,
    }

    public static void main(String[] args) {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }


//        switch (myVar){
//            case Sunday:
//                System.out.println("today sunday ");
//                break;
//            case monday:
//                System.out.println("today monday");
//                break;
//            case thusday:
//                System.out.println("today hamuman day");
//                break;
//            case wednesday:
//                System.out.println("today my day");
//                break;
//            case thursday:
//                System.out.println("today thursday");
//                break;
//            case friday:
//                System.out.println("today funday");
//                break;
//            default:
//                System.out.println("no any day");
//                break;
//        }

    }
}
