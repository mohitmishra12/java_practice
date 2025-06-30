import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) {
        try {
            File obj = new File("new.txt");
            Scanner myReader = new Scanner(obj);
            while (myReader.hasNextLine()){
                String mynewFile = myReader.nextLine();
                System.out.println(mynewFile);
            }
            myReader.close();


        }catch (FileNotFoundException e){
            System.out.println("file an error occers");
            e.printStackTrace();
        }
    }
}
