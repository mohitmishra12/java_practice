
class vole extends Thread{

    volatile boolean running = true;

    public void run(){
        while (running){

        }
        System.out.println("stop....");
    }

    public void stope(){
        running = false;

    }

    public void stopThread() {
    }
}



public class volatileExample {
    public static void main(String[] args) throws InterruptedException {
        vole vole1 = new vole();
        vole1.start();

        Thread.sleep(1000);

        vole1.stopThread();

    }
}
