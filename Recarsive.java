public class Recarsive {
    // Recursive method to calculate factorial
    int factorial(int n){
        if (n==0){
            return 1;
            
        } else if (n==1) {
            return 1;
        }else{
            return n * factorial(n-1) + factorial(n-2);
        }
    }

    public static void main(String[] args) {
        Recarsive obj = new Recarsive();
        int result = obj.factorial(5); // Method call
        System.out.println("Factorial of 5 is: " + result);
    }
}
