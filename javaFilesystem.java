import java.io.File;
import java.io.IOException;

public class javaFilesystem {
    public static void main(String[] args) throws IOException {
       try{
           File newfile = new File("new.txt");
           if (newfile.createNewFile()){
               System.out.println("file craete :" + newfile.getName());
           }else{
               System.out.println("file already exist");
           }

       }catch (IOException e){
           System.out.println(" An error are occurred");
           e.printStackTrace();
       }

    }
}
