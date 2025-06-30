import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;



public class RemoveDublicate {
    public static void main(String[] args) {
        List<Integer> Remove = Arrays.asList(10, 20, 10, 30, 20, 40,23,43,65,65,93,23,10,23,65);
        long count = Remove.stream().count();
        System.out.println(" count : " + count);
//        Remove.stream().distinct().forEach(System.out::println);
    }
}
