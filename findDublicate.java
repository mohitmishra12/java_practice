import java.util.Arrays;
import java.util.List;

public class findDublicate {
    public static void main(String[] args) {
        System.out.println("");

        List<Integer> newInteger = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> Dublicate = newInteger.stream().filter(n-> n % 2 == 0).toList();
        System.out.println(Dublicate);
    }
}
