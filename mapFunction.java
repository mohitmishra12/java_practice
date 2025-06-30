import java.util.Arrays;
import java.util.List;

public class mapFunction {
    public static void main(String[] args) {
        List<String> mymethodd = Arrays.asList("mohit", "amit");

        mymethodd.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
