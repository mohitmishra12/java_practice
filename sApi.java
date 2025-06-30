import java.util.*;

public class sApi {
    public static void main(String[] args) {
        List<String> mynew = Arrays.asList("rohit","mohit", "rahul","raj");

        mynew.stream()
                .filter(mynames -> mynames.contains("x"))
                .forEach(System.out :: println);




    }
}
