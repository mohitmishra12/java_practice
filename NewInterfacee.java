

@FunctionalInterface
interface Greetibg{
    void sayHello(int name);

}

public class NewInterfacee {
    public static void main(String[] args) {
        Greetibg greet = name -> System.out.println("my new interface :" + name);
        greet.sayHello(34);



    }
}
