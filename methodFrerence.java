
interface Calculater{
    int Mul(int a,int b);
}
class Mathutil{
    public static int sum(int a, int b){
        return a*b;
    }}


public class methodFrerence {
    public static void main(String[] args) {
        Calculater cal = Mathutil::sum;
        System.out.println(cal.Mul(10,20));

    }
}
