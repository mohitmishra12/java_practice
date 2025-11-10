public class ArraySearch {
    public static void main(String[] args) {
        int arr [] = { 23 ,34, 56,78,45,34};


        int key = 34;
        boolean found = false;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key){
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }


            
        }

        if(!found){
            System.out.println("not found");

        }


    }
}
