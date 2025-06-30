public class RunnableThred{
    public static void main(String[] args) {

        Runnable r = ()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println(" thred Count : " + i);

            }

        };

        Thread t = new Thread(r);
        t.start();
        System.out.println("thred are start...........");
    }
}
