import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forLoop {
    public static void main(String[] args) {


        List<Integer>  newLists =  Arrays.asList(2,3,5,6,7,8,7,67,6,5);

        ArrayList<Integer> newListss = new ArrayList<>(newLists);
         newListss.stream().filter(n-> n%2==0).forEach(System.out::println); //even numbers
        newListss.stream().filter(n-> n%2!=0).forEach(System.out::println);//odd numbers
        newListss.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);//descending order
        newListss.stream().distinct().forEach(System.out::println);//remove duplicates
        newListss.stream().mapToInt(i -> i*i).forEach(System.out::println);//square of each number in the arraylist
        newListss.stream().reduce((sum,n)->sum+n).ifPresent(System.out::print);//addition


//        int[] arr = {1, 3, 4, 5, 6, 4, 3, 54, 5};
//
//
//
//        int i;
//        for (i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        if (i == arr.length) {
//            System.out.println("loop completed");
//        }
    }

}