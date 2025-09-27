import java.nio.charset.StandardCharsets;
import java.util.Locale;

@FunctionalInterface
interface MyNewInteface {
    void hayMini(String name);

    default void newoen() {
        System.out.println("my new default merthod calling".toUpperCase().length());
    }
}
public class FuncationalInterfaceNew {
    public static void main(String[] args) {

        MyNewInteface greet = (name -> System.out.println("name:" + name));
        greet.hayMini("mohit");
        greet.toString().getBytes(StandardCharsets.UTF_8);
        greet.newoen();
    }
}
