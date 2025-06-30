public class Constractor {
    int model;
    int year;

    public Constractor(int modele , int years){
        model = modele;
        year = years;
    }

    public static void main(String[] args) {
        Constractor con = new Constractor(2022, 2025);
        System.out.println("my car mode" + con.model + "   "+ con.year+ "this is model name");

    }
}
