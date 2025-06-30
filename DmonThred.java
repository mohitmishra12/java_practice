
 class newT extends Thread{
    public void run(){
        while (true){
            System.out.println("thered are strat.....");

            try {
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println("Demon Interprater start");
            }
        }

    }
 }


public class DmonThred {
    public static void main(String[] args) {
        newT t = new newT();
        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(1000);
            System.out.println("Main thread ends.");

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
