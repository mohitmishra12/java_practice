
public class ReversArray {
    public static void main(String[] args) {

        int arr [] = {23,4,5,678,99,78,66,75};
        int start = 0 , end = arr.length-1;

        while (start< end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

        System.out.println("Revers number : ");

        for (int i : arr){
            System.out.println( i + " ");
        }

    }



}



