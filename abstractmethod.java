abstract class mynewcl{

    abstract public void feul();
    public void bew(){
        System.out.println("bew rate");

    }


 }

 class tata extends mynewcl{
    public void feul(){
        System.out.println("feul rate");

    }

}




public class abstractmethod {
    public static void main(String[] args) {
        tata t = new tata();
        t.feul();
        t.bew();


    }
}
