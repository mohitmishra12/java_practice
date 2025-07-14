public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = { 22,34,23,44,56,76,43,45,23};

        int start = 0, end = arr.length - 1;
        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
