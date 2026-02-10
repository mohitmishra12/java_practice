import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class FindDublicatee {
    public static void main(String[] args) {

        List<Integer> Dubliacte = Arrays.asList(1, 2, 3, 2, 4, 1);

        System.out.println(Dubliacte.stream()
                .filter(i -> Collections
                        .frequency(Dubliacte,i)>1)
                .collect(Collectors.toList()));
//        System.out.println(Dubliacte);
    }
}
