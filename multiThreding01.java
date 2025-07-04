



 class mythered extends Thread{
    public void run(){
        System.out.println("thread are started");
    }

}
public class multiThreding01 {
    public static void main(String[] args) {
        mythered t1 = new mythered();
        t1.start();

    }
}
