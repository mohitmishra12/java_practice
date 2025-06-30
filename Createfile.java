import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) {
     try {
         File myObje = new File("students.txt");
         if(myObje.createNewFile()){
             System.out.println("file created " + myObje.getName());
         }else{
             System.out.println("error file not created");
         }


     }catch (IOException e){
         System.out.println("error......");
         e.printStackTrace();
     }
    }
}
