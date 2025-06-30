import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable{
    private  int TaskId;

    public MyTask(int id ){
        this.TaskId = id;

    }

    public void run(){
        System.out.println("task" + TaskId + "Started by :" + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task" + TaskId + "finised");

    }

        }

public class ThreddPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            service.execute(new MyTask(i));


        }
        service.shutdown();


    }
}
