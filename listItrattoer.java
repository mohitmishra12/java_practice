import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listItrattoer {
    static void main() {

        List<String> names = new ArrayList<String>();
        names.add("A");
        names.add("B");
        names.add("C");

        ListIterator<String> newIter = names.listIterator();

        System.out.println("Forward:");
        while(newIter.hasNext()){
            System.out.println(newIter.next());
        }
        System.out.println("Backward:");
        while(newIter.hasPrevious()){
            System.out.println(newIter.previous());
        }
    }
}
