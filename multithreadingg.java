
class mythread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("my frist thred calling : " + i);
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e);
            }


        }
    }
}


public class multithreadingg {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.start();



    }
}
