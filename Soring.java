import java.util.Arrays;

public class Soring {
    public static void main(String[] args) {
        int[] arr = {64, 534, 344, 545, 65, 11, 90};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

