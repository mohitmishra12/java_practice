public class parameterCon {
    String name;
    int age;


    parameterCon(String n , int m){
        name = n;
        age = m;

    }
    parameterCon(parameterCon s){
        name= s.name;
        age = s.age;
    }
    void  Showname(){
        System.out.println("name :" + name );
        System.out.println("age :" + age);
    }

    public static void main(String[] args) {
        parameterCon para = new parameterCon("mohit", 23);
        parameterCon S2 = new parameterCon(para);
        para.Showname();

    }
}
