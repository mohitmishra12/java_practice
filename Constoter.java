 class con {
    String name;
    int age;

    con(){
        System.out.println("this is new defalt constracor");

    }
    con(String n , int m){
        name = n;
        age = m;


    }
    con(con c){
        this.name = c.name;
        this.age = c.age;


    }
    void show(){
        System.out.println(  "name:  "   + name+" \n age:   " + age);

    }
 }



public class Constoter {
    public static void main(String[] args) {
        con conste = new con();

       con S2 = new con("mohit" , 23);
       S2.show();

       con S3 = new con(S2);

    }


}
