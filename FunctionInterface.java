
//@FunctionalInterfacee
interface matchoperation{
    int operate ( int a , int b);

}


public class FunctionInterface {
    public static void main(String[] args) {
        matchoperation add = (a,b) -> a + b;
        matchoperation multi = (a,b) -> a * b;




        System.out.println("Add a and b :" + add.operate(3,5));
        System.out.println("multi a and b :" + multi.operate(3,5));



    }
}
