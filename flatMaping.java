import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMaping {
    public static void main(String[] args) throws InterruptedException {
        List<List<String>> nested = Arrays.asList(
                Arrays.asList("Java", "Spring"),
                Arrays.asList("Hibernate", "JPA"),
                Arrays.asList("python", "ORM"),
                Arrays.asList("MicroServices", "SQL")
        );

        List<String> flatList = nested.stream()
                .flatMap(list -> list.stream())
                .map(n->n.toUpperCase())
                .sorted()
                .limit(8)
//                .skip(3)
                .collect(Collectors.toList());

        System.out.println(flatList);
    }
}