import java.util.Arrays;
import java.util.List;

public class StramReducer {
    public static void main(String[] args) {

        List<Integer> newreducer = Arrays.asList(1,2,3,4,5,6);

        int nums = newreducer.stream().reduce(0, (a,b) -> a +b);
        System.out.println(nums);

    }
}
