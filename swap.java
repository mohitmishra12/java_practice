import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println(" swap number code :\n\n ");
        System.out.println("Enter  value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter value of B :");
        int b = sc.nextInt();

       int c = a;
       a = b;
       b = c;
        System.out.println("value of is A : " + a);
        System.out.println("value of is B : " + b);






    }
}
