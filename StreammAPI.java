import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreammAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "SpringBoot","hibernate" ,
                "MVC" , "ORM", "microservicess", "Docker","Django" , "java Core");

        names.stream().filter(name ->name.startsWith("j")).forEach(System.out::println);


    }
}
