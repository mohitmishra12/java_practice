import java.util.*;
import java.util.LinkedList;


public class ListIteratorr {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("pune");
        cities.add("bangalore");

        ListIterator<String> litr = cities.listIterator();

        System.out.println("Forward Traversal:");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("Backward Traversal:");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}