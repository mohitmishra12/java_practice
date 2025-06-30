import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File deleted = new File("new.txt");
        if (deleted.delete()){
            System.out.println("file deleted : " + deleted.getName());
        }else {
            System.out.println("failed to deleted file");
        }
    }
}
