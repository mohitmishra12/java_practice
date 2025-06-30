class counter{
    void printMassage(){
        System.out.println("my static method calling...");
    }
}

public class staticMethod {
    public static void main(String[] args) {
        counter my = new counter();
        my.printMassage();

    }
}
