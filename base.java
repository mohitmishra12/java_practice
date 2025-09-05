import java.util.Base64;

public class base {
    public static void main(String[] args) {

        String str = "mohit mishra rewa";

        String encoded = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encoded);

        byte[] decode = Base64.getDecoder().decode(encoded);
        String nn = new String(decode);
        System.out.println(nn);



    }
}
