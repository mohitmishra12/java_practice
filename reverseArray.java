import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,55,67,455};

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;


        }
        System.out.println(Arrays.toString(arr));

    }
}
