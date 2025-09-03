import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortingNew {
    public static void main(String[] args) {

        List<Integer> mysortingString = Arrays.asList(100,433,3,13,12,6);

        List<Integer> newSort = mysortingString.stream().sorted().collect(Collectors.toList());
        System.out.println(newSort);

//        List<String> newSorted = mysortingString.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//        System.out.println(newSorted);


    }
}
