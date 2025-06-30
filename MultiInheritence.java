class granfather{
    void simple(){
        System.out.println("myGrandFather");
    }

}
class father extends granfather{
    void fathermethod(){
        System.out.println("MyFather");
    }
}

class child extends father{
    void childme(){
        System.out.println("my Genration");
    }
}


public class MultiInheritence {
    public static void main(String[] args) {
        child ch = new child();
        ch.childme();
        ch.fathermethod();
        ch.simple();

    }
}
