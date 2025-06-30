import java.util.*;

public class Stringsss {
    public static void main(String[] args) {
        String fristname = "mohit";
        String lastname = "mishra";
        String fullname = fristname + " " + lastname;

        for( int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.intern());
        }


//        Scanner sc = new Scanner(System.in);
//                String name = sc.nextLine();
//        System.out.println("your name is : " + name);
    }
}
