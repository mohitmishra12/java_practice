public class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,55,67,455};
        int max = arr[0], min = arr[0];

        for(int num : arr){

            if(num > max ) max = num;
            if(num < max ) min = num;
        }

        System.out.println("Largest" + max);
        System.out.println("Largest" + min);
    }
}
