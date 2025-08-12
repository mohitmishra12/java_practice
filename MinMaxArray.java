

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {5,2,3,54,65,87,6};
        int max = arr[0], min = arr[0];

        for(int num : arr){
            if(num>num) max = num;
            if(num< num) min = num;

        }
        System.out.println("Largest" + max);
        System.out.println(" smallest" + min);

    }
}

