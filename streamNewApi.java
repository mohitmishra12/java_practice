import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class streamNewApi {
    public static void main(String[] args) {


//        List<String> newlist = Arrays.asList("mohit ","abhishek","manish","rahul");
//
//        newlist.stream()
//                .filter(n->n.startsWith("m"))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        filter method in stream api in java;

//        List<Integer> newarray = Arrays.asList(23,545,6,7,5,78,9);
//
//        newarray.stream().filter(n->n%2 ==0).forEach(System.out::println);

//        mapp
//        List<String> newmap = Arrays.asList("mohit","rohit");
//
//        newmap.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);


//        flatmaps add to diffrent array list
//
//        List<List<String>> newflatmap = Arrays.asList(Arrays.asList("a","b"),
//                Arrays.asList("c","d"));
//
//        newflatmap.stream().flatMap(Collection::stream).forEach(System.out::println);

//        5. sorting in stream

//        List<Integer> newSort = Arrays.asList(2,3,4,23,45,6,74);
//
//        newSort.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);


//        List<String> newSort = Arrays.asList("mohit", "roh", "zami","mah", "ko");
//
//        newSort.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
//

//      7,  distinct


//        List<Integer> newSort = Arrays.asList(2,3,4,23,45,6,74,4,74,2,3);
//
//        newSort.stream()
//                .sorted()
//                .distinct()
//                .collect(Collectors.toList())
//                .stream().filter(n->n%2==0)
//                .skip(2).limit(7)
//                .forEach(System.out::println);


//        8 . reduce

//        List<Integer> reducenew = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//        int sum = reducenew.stream().
//                reduce(0,Integer::sum);
////        reducenew.stream().min(Integer::compare);
//        System.out.println(sum);
//
//


//        9. Parallel Streams


        List<Integer> newnum = Arrays.asList(1,2,4,5,34,6,78,56,34);

        newnum.parallelStream().forEach(System.out::println);
    }
}
