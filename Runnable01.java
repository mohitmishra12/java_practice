
class myThredd implements Runnable{
    public void run(){
        System.out.println("runnable interface");
    }
}


public class Runnable01 {
    public static void main(String[] args) {
        myThredd myrunn = new myThredd();
        Thread t1 = new Thread(myrunn);

        t1.start();

    }
}
