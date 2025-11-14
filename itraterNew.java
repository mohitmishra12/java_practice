
import java.util.*;

public class itraterNew {
    static void main() {
        List<String> it =  new ArrayList<>();
        it.add("A");
        it.add("B");
        it.add("C");
        it.add("D");

        Iterator<String> itr = it.iterator();
        while (itr.hasNext()) {
            System.out.printf("%s ", itr.next());
            if (itr.hasNext()) {
                System.out.print(" ");

            }

        }
        System.out.println();
    }
}
