
class newThred extends Thread{

    public void run(){
        System.out.println("thread are running" + Thread.currentThread().getName());
    }

}


public class Threading_new {
    public static void main(String[] args) {
        newThred t1 = new newThred();
        t1.start();

    }
}
