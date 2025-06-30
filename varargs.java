public class varargs {
    public static void printvalue(String msg, int... number) {
        System.out.println(msg + ":");
        for(int num : number){
            System.out.println(num + " ");

        }
        System.out.println( );

    }

    public static void main(String[] args) {
        printvalue("value", 1,2,3,4);
        printvalue("single",100);
        printvalue("none");
        
    }
}
