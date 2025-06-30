
class MyThred extends Thread{
    public void run(){
        System.out.println("my new thred are started ");
    }
}


public class threading {
    public static void main(String[] args) {
//        int sum = 0;
//        for(int i = 0; i <= 5 ; i++);
        MyThred t1 = new MyThred();
        t1.start();

    }
}
