@FunctionalInterface
interface FunctionalInterfaceexample {
    void hello();
}
public class FunctionalInterfacxample {
    public static void main(String[] args) {
        FunctionalInterfaceexample obj = () -> System.out.println("this is my function");
        obj.hello();

    }
}
