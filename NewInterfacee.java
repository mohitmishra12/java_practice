

@FunctionalInterface
interface Greetibg{
    void sayHello(String name);

}

public class NewInterfacee {
    public static void main(String[] args) {
        Greetibg greet = name -> System.out.println("my new interface :" + name);
        greet.sayHello("java");



    }
}
