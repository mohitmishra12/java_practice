import java.util.Arrays;
import java.util.List;

public class streamapi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Stream to filter even numbers and display
        numbers.stream()
                .filter(n -> n % 3 == 0)
                .limit(2)
                .forEach(System.out::println);
    }
}

