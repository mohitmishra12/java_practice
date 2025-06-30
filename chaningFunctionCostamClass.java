import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int marks;


    Student(String name , int marks){

        this.name = name;
        this.marks = marks;

    }

}
public class chaningFunctionCostamClass {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Mohit", 80),
                new Student("Amit", 65),
                new Student("Rohit", 90),
                new Student("Sonu", 70)
        );

        List<String> toppers = students.stream()
                .filter(s -> s.marks >= 70).map(n->n.name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(toppers);
    }
}