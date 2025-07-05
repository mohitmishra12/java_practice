
import java.io.*;


public class ReadExample {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        bw.write("Hello, Mohit!");
        bw.newLine();
        bw.write("Welcome to Java I/O.");
        bw.close();

    }

}
