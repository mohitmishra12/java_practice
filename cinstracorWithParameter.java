
class mohit{
    mohit(String myname){
        System.out.println("my new constracor " + myname);


    }

}
class mohitm extends mohit1 {
    mohitm(){
        super("mohit mishra");
        System.out.println("my secound constracor");
    }
}



public class cinstracorWithParameter {
    public static void main(String[] args) {
        mohitm mm = new mohitm();

    }
}
