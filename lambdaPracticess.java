import java.util.Arrays;
import java.util.List;
import java.util.*;


public class lambdaPracticess {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(12);
        newList.add(54);
        newList.add(78);
        newList.add(74);

        newList.remove(1);

        newList.forEach(n-> System.out.println(n));
    }
}
