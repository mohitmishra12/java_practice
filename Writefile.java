import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Writefile {
    public static void main(String[] args) {
     try {
         File file = new File("newmohit.txt");
         Scanner Myreader = new Scanner(file);
         while (Myreader.hasNextLine()){
             String data = Myreader.nextLine();
             System.out.println(data);
         }
         Myreader.close();
     }catch (FileNotFoundException e){
         System.out.println("Error......");
         e.printStackTrace();
     }

    }
}
