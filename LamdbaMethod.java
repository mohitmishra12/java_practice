@FunctionalInterface
interface Hello {
    void sayHello();
}

public class LamdbaMethod {
    public static void main(String[] args) {

        Hello h = () -> System.out.println("my new interface are calling in Hello method ");
        h.sayHello();

    }
}
