import java.util.Arrays;
import java.util.List;

public class ReducerFun {
    public static void main(String[] args) {
        List<Integer> myreducer = Arrays.asList(22,2,3,4,66,54,43);
       int sum = myreducer.stream().reduce(0,(a,b)-> a+b);
        System.out.println("sum in all value : " + sum);

    }
}
