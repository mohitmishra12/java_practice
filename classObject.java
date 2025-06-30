
class mynew{
    String   name;
    int age ;
    String address;
    String company;

    void start(){
        System.out.println(name + "  from madhya pradesh" + age + " and " + address + "and" +company + "company name ");
    }
}


public class classObject {
    public static void main(String[] args) {
        mynew mydata = new mynew();
        mydata.name= "mohit";
        mydata.age = 23;
        mydata.address= "rewa ";
        mydata.company = "lycaDigital";

        mydata.start();
        mydata.start();

    }

}
