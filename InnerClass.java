import java.util.Scanner;

class OuterClass{
    int x = 14;

    static class InnerMyclass {
       int y = 12;
    }
}



public class InnerClass {
    public static void main(String[] args) {
        OuterClass Myouter = new OuterClass();
//        OuterClass.InnerMyclass Myinner = Myouter.new InnerMyclass();
        System.out.println(Myouter.x);
    }
}
