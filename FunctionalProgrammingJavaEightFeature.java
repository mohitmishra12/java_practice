@FunctionalInterface
interface MyFunctionalInterface {
    void greet(String name);   // Only one abstract method
}

public class FunctionalProgrammingJavaEightFeature {
    public static void main(String[] args) {

        MyFunctionalInterface ft = name -> System.out.println("name -: " + name);
        ft.greet("mohit");
    }
}
