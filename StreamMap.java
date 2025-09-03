import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;


// manish verma
public class StreamMap {
    public static void main(String[] args) {
      List<String> newMap = Arrays.asList("MOHIT","MISHRA");

              List<String> mapmathod = newMap.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(mapmathod);
    }
}
