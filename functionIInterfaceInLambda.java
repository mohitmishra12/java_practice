import java.util.*;
@FunctionalInterface
interface MyInterface {
    void sayHello(String name);
}

public class functionIInterfaceInLambda {
    public static void main(String[] args) {
        MyInterface greeting = name -> System.out.println("name :" + name);
        greeting.sayHello("mohit");
//        List<String> newStream = Arrays.asList();
//
//        newStream.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
