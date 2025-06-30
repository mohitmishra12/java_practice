
class Myrunable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }

}

public class thradeee {
    public static void main(String[] args) {
        Myrunable myrunable = new Myrunable();
        Thread thread = new Thread();
        thread.start();
    }

}
