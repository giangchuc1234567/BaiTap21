import java.util.Scanner;

public class BaiTap11 {
    public static void main(String[] args) {
        int a , b;
        Scanner sca = new Scanner(System.in);
        System.out.println("Nhập số a : ");
        a = sca.nextInt();
        System.out.println("Nhập số b : ");
        b = sca.nextInt();

        int tong ;
        System.out.println("a + b = "+(a+b));

        int hieu ;
        System.out.println("a - b = "+(a-b));

        int tich ;
        System.out.println("a * b = "+(a*b));

        float chia = (float) a / b ;
        System.out.println("a / b = "+chia);

        float sodu = a%b;
        System.out.println("a % b = "+sodu);

    }
}
