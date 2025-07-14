public class ArrayMaxMin {
    public static void main(String[] args) {

        int[] arr = {11, 5, 7, 99, 45, 32,111,23,444,1};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];


        }

        System.out.println("min number of length :" + min);
        System.out.println("max number of length :" + max);

    }
}
