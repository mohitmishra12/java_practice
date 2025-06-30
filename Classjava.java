
class office{
    static String name;
    String department;
    static int id;
    String emailid;

    void showdetails (){
        System.out.println("name : " + name );
        System.out.println("ID :" + id );
    }

}

public class Classjava {
    public static void main(String[] args) {
        office mycar = new office();
        office.name = "mohit";
        office.id = Integer.parseInt(("7470"));

        mycar.showdetails();
    }
}
