import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public enum newEnum {
    FRIST,SECOND,THIRD,FOURTH,FIFTH;


    public static void main(String[] args) {
        newEnum myenum = newEnum.SECOND;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println(FRIST);
        }else if (num==2){
            System.out.println(SECOND);
        } else if (num==3) {
            System.out.println(THIRD);
        } else if (num==4) {
            System.out.println(FOURTH);
        }else{
            System.out.println(FIFTH);
        }
        System.out.println(myenum.name());
    }
}

