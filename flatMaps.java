import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class flatMaps {
    public static void main(String[] args) {
        List<List<String>> flatMapss = Arrays.asList(
                Arrays.asList("mohit","mishra"),
                Arrays.asList("rohit","mishra")
        );

        List<String> flat = flatMapss.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flat);
    }
}
