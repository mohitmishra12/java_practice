import java.io.File;

public class readFilee {
    public static void main(String[] args) {

        File f = new File("mynewfiles.txt");
        if(f.exists()){
            System.out.println("The file already exist in the system.");
        }else{
            try {
                f.createNewFile();
                System.out.println("A new file has been created.");
                System.out.println("The file name is : "+f.getName());
                System.out.println("The absolute path of the file is : "+f.getAbsolutePath());
                System.out.println("The file was last modified on : "+f.lastModified());
                System.out.println("The size of the file is : "+f.length()+" Bytes");
                System.out.println("The file is a hidden file : "+f.isHidden());
                System.out.println("The file is a directory : "+f.isDirectory());
                System.out.println("The file is a readable file : "+f.canRead());
                System.out.println("The file is a writable file : "+f.canWrite());
                System.out.println("The file is a executable file : "+f.canExecute());
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }
}
