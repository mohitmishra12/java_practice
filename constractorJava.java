class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constractorJava {
    public static void main(String[] args) {
        Person p = new Person("Rohit", 30);
        p.displayDetails();
        p.displayDetails();
        p.displayDetails();
    }
}
