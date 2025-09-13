public class StringNew {
    public static void main(String[] args) {

        String str = " mohit mishra";

//        System.out.println(str.length());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.lastIndexOf("ra"));
//        System.out.println(str.getBytes());
//        System.out.println(str.replace("mo","ro"));
//        System.out.println(str.split("hi"));

        StringBuilder st = new StringBuilder("mohit");
        st.append(" mishra");
        System.out.println(st);

        StringBuffer st1 = new StringBuffer("rohit");
        st1.append(" mishra");
        System.out.println(st1);



    }
}
