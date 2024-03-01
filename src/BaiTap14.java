import java.util.Scanner;

public class BaiTap14 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a , b;
        System.out.println("Nhập số a = ");
        a = sca.nextInt();
        System.out.println("Nhập số a = ");
        b= sca.nextInt();

        System.out.println(a+" == "+b+" : "+(a==b));
        System.out.println(a+" != "+b+" : "+(a!=b));
        System.out.println(a+" < "+b+" : "+(a<b));
        System.out.println(a+" > "+b+" : "+(a>b));
        System.out.println(a+" <= "+b+" : "+(a<=b));
        System.out.println(a+" >= "+b+" : "+(a>=b));
        System.out.println("Ca hai la so chan : "+(a%2==0 && b%2==0));
        System.out.println("Co it nhat mot so chan : "+(a%2==0 || b%2==0));
    }
}
