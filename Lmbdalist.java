import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lmbdalist {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(12);
        number.add(64);
        number.add(89);
        number.add(948);
        number.add(53);
        number.add(75);
        number.add(75);
        number.remove(0);
        number.forEach((n)->{
            System.out.println(n);

        });

    }
}
