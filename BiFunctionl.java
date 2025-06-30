
import java.util.function.BiFunction;


public class BiFunctionl {
    public static void main(String[] args) {
        BiFunction<String, String, Boolean> equalsCheck = String::equals;
        System.out.println(equalsCheck.apply("java", "Mohit"));
    }
}
