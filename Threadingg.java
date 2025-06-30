
class NumbersThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("number: " + i);

        }

    }

}

class NumbersSecoundThread extends Thread{
    public void run(){
        for (int CH = 'A'; CH < 'E'; CH++) {
            System.out.println("Charecter : " + CH);

        }
    }
}


public class Threadingg {
    public static void main(String[] args) {
        NumbersThread my = new NumbersThread();
        NumbersSecoundThread s = new NumbersSecoundThread();

        my.start();
        s.start();

    }
}
