

public class ReversString {
    public static void main(String[] args) {
        String str = "Mohit";
        String revers = " ";

        for (int i=str.length()-1; i>=0; i--){
            revers = revers+ str.charAt(i);
        }
        System.out.println("string reversed : " + revers);


    }
}
