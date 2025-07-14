public class ArrayDeletion {
    public static void main(String[] args) {
        int arr[] = { 12,43,46,76,44,34};

        int size = 6;
        int indexToDelete = 3;

        for (int i = indexToDelete; i < size-1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++) {

            System.out.println(arr[i] + " ");
            
        }
    }
}
