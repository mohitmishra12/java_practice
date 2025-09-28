
class mytred extends Thread{
    public void newone(){

        String myString = "Thread One are started";
        System.out.println("new thread are started please wait after some time:" + myString);
    }

    int numone1 = 12;
    public void after(){
        System.out.println("after Thread are close :" + numone1);
    }
}

public class Lambda_practice {
    public static void main(String[] args) {
        Thread  mythered = new Thread();
        mytred one = new mytred();
        mytred after1 = new mytred();
        after1.after();
        one.newone();
        one.start();
        mythered.start();
        mythered.isAlive();


    }
}
