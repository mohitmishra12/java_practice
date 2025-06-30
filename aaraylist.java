import java.util.ArrayList;

public class aaraylist {
    public static void main(String[] args) {
        ArrayList<Integer> myarray = new ArrayList<Integer>();
        myarray.add(21);
        myarray.add(243);
        myarray.add(25);
        myarray.add(76);
        myarray.add(75);
        myarray.add(76);
//        int size = myarray.size();
//      myarray.remove(1);
      myarray.get(1);

        for ( int myint  : myarray) ;
        {
            System.out.println(myarray.get(1));
        }
    }
}

