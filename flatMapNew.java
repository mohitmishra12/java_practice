import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapNew {
    public static void main(String[] args) {
        List<List<String>> lists = Arrays.asList(
                Arrays.asList("a", "b"),

                Arrays.asList("c","d")
        );

        List<String> finalList = lists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(finalList);
    }
}
