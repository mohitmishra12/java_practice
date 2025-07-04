



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


// Method	Description
// start()	Starts the thread
// run()	Contains the code that runs in thread
// sleep(ms)	Pauses the thread for given milliseconds
// join()	Waits for another thread to finish
// isAlive()	Checks if thread is alive
// setName(name)	Sets thread name
// getName()	Gets thread name
// setPriority()	Sets thread priority