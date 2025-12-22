
import java.io.File;
import java.io.IOException;


public class fileHandlingNew {
    public static void main(String[] args) throws IOException {

        File mynewFile = new File("mynewfile.txt");
        try{
            if(mynewFile.createNewFile()){
                System.out.println("File created: " + mynewFile.getName());
            }else{
                System.out.println("File already exist.");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
