public class findMax {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int min = arr[0];
        for (int num : arr) {
            if ( num < min) min = num;

        }

        System.out.println(min);
    }
}


