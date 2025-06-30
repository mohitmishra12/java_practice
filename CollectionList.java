import java.util.ArrayList;
import java.util.Collections;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> MyLists = new ArrayList<String>();
        MyLists.add("mohit");
        MyLists.add("ram");
        MyLists.add("harry");
        MyLists.add("rahul");
        MyLists.add("prince");
        MyLists.add("saurabh");

        Collections.sort(MyLists , Collections.reverseOrder());

        for(String i : MyLists){
            System.out.println("my name is : " + i);

        }


    }
}
