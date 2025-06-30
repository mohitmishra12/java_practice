import java.util.ArrayList;

public class AarrayListNew {
    public static void main(String[] args) {
        ArrayList <Integer>  array = new ArrayList<>();
        array.add(21);
        array.add(32);
        array.add(98);
        array.add(65);
        array.add(76);
        array.add(45);
        array.add(21);

        System.out.println(array.size());
        System.out.println(array.remove(3));
        System.out.println(array.get(3));
        for (int i = 0; i < array.size(); i++) {
            System.out.println("my new arrayalist :" + array );

        }

    }
}
