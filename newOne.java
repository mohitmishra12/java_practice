public class newOne {
    public static void main(String[] args) {
        String s1 = "Mohit mishra from bangalore";
        String output = "tihom arhsim morf erolagnab";

        String[] words = s1.split("  ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            result.append(new StringBuilder(word).reverse().toString()).append(" ");

        }

        System.out.println("S1" + s1);
        System.out.println("revers" + result.toString().trim());
    }
}
