

@FunctionalInterface
interface MyFunctionalInterfacee {
    void greet(String name); // Single Abstract Method (SAM)
}
public class LambdaExample {
    public static void main(String[] args) {

        MyFunctionalInterfacee sayHello = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        sayHello.greet("mohit");
        sayHello.greet("Mishra");
    }
}
