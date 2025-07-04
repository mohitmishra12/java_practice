
class Demo extends Thread{
    public void run(){

        for (int i = 0; i < 5; i++) {
           try {
               Thread.sleep(1000);

           }catch (Exception e){
               System.out.println(e);
           }
            System.out.println("error are getting");


        }
    }
}



public class DemoThred {
    public static void main(String[] args) {

        Demo mydemo = new Demo();
        mydemo.start();

    }
}
