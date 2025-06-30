import java.util.*;
import java.util.stream.*;

public class Stream {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("Amit", "Rahul", "Sita");

        list.stream()
//                .filter(num -> num %2 == 0)
                .forEach(System.out::println);




    }
}
