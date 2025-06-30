public class starMethod {
    public static void main(String[] args) {

        int star = 0;
        while (star < 10){
            System.out.print("*");
            int i = 0;
            while (i<star){
                System.out.print( " *");
                i++;

            }
            System.out.println();
            star++;

        }
    }
}
