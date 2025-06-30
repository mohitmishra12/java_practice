import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "kia", "Mazda", "sonet"};
        Arrays.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
