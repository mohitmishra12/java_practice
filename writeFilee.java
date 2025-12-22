import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class writeFilee {
    public static void main(String[] args) throws IOException {

        FileWriter fr = new FileWriter("mynewfile.txt");
        fr.write("Hello World");
        fr.close();
        System.out.println("Successfully written");
    }
    }


