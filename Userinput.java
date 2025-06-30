import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please Enter your name :->  ");
        Integer username =  sc.nextInt();

        System.out.println("username :->" + username);

    }
}
