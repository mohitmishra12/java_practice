class myAccesss{
    public static String name = "mohit";
    public int age;
    public int rollNunmber  = 2323;

    public void  show (){
        System.out.println("please show my information ");
    }


}


public class AccessM {
    public static void main(String[] args) {
        myAccesss neww = new myAccesss();
        System.out.println(myAccesss.name);
        neww.age = 21;
        neww.show();


    }

}
