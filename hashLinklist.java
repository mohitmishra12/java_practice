import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hashLinklist {
    public static void main(String[] args) {
        
        List<Object> obj = Arrays.asList();
        obj.add(24);
        obj.add(34);
        obj.add(76);
        obj.add(45);
        obj.add(88);
        obj.add(34);

        for(Object newArrayList:obj){
            System.out.println(newArrayList);

            obj.remove(4);
            System.out.println(obj);


        }
    }
}
