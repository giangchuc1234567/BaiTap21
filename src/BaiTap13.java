import java.util.Scanner;

public class BaiTap13 {
    public static void main(String[] args) {
        float a;
        System.out.println("Nhập giá trị a = ");
        Scanner sca = new Scanner(System.in);
        a= sca.nextFloat();

        System.out.println("a= "+a);
        System.out.println("a+=5 "+(a+=5));
        System.out.println("a-=4 "+(a-=4));
        System.out.println("a*=3 "+(a*=3));
        System.out.println("a/=3 "+(a/=3));
        System.out.println("a%= "+(a%=3));



    }
}
