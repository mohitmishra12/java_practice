interface myinter{
    void show();
}


public class lamdbaExample {
    public static void main(String[] args) {
        myinter cl = () -> System.out.println("my new lambda test fun");
        cl.show();

    }

}
