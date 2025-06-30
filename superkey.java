
class Animall {
    void soundd() {
        System.out.println("Animal makes sound");
    }
}

class Doge extends Animall {
    void soundd() {
        System.out.println("Dog barks");
        super.soundd();  // Parent class method call
    }
}
public class superkey {
    public static void main(String[] args) {
        Doge my = new Doge();
        my.soundd();

    }
}
