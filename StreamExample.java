//import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

//        1st question

//        List<java.lang.String> list = Arrays.asList("rahut" , "ram","dhanraj","mohit","amit");
//
//        Stream<java.lang.String> stream = list.stream();
//        stream.forEach(System.out::println);
//        List<Integer> list = Arrays.asList(64 ,74,66,43,22,34,77,56,54,36,54,98,76,87);



//       2nd no..
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        List<Integer> evenNumber = list.stream()
//                .filter(n->n%3==0 &n%2==0)
//                .collect(Collectors.toList());
//        System.out.println(evenNumber);


//3rd UpperCase

//        List<String> upercase = Arrays.asList("rahut" , "ram","dhanraj","mohit","amit");
//        List<String> uppercaseconvert = upercase.stream()
//                .map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(uppercaseconvert);

//3rd lowercase
//        List<String> lowercase = Arrays.asList("rahut" , "ram","Dhanraj","MOhit","amit");
//        List<String> lowercaseconvert = lowercase.stream()
//                .map(String::toLowerCase).collect(Collectors.toList());
//        System.out.println(lowercaseconvert);



//        5 sorting


//        List<Integer> sorting = Arrays.asList(2,4,5,3,5,77,45,34,67,55);
//        List<Integer> sort = sorting.stream().sorted().collect(Collectors.toList());
//        System.out.println(sort);

//        List<String> name = Arrays.asList("rahul","ram", "syam","mohit");
//        name.stream().forEach(System.out::println);


//        7 th collect
//        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4);
//
//        // Convert Stream to Set
//        Set<Integer> uniqueNumbers = numbers.stream().collect(Collectors.toSet());
//
//        System.out.println(uniqueNumbers);


//        8th reducer

//        List<Integer> reducerr = Arrays.asList(3,4,5,6,7,8,1,2,9);
//        int sum = reducerr.stream().reduce(0,(a,b)-> a+b);
//        System.out.println(sum);


//        9th ParallelStreamExample

        List<Integer> ParallelS = Arrays.asList(1,2,3,4,5,6);
        ParallelS.stream().parallel().forEach(System.out::println);










    }
}
