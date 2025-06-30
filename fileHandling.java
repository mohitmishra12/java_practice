import java.io.File;

public class fileHandling {
    public static void main(String[] args) {
        File file = new File("mohitm.txt");
        try {


        if (file.createNewFile()){
            System.out.println(" file created :" + file.getName());

        }else{
            System.out.println("File already exiest");
        }

//        if(file.delete()){
//            System.out.println("file deleted:" + file.getName());
//
//        }else {
//            System.out.println("file deleted");
//        }

    }catch (Exception e){
            e.printStackTrace();
        }
}
}
