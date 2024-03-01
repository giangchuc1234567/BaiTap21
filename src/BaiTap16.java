import java.util.Scanner;

public class BaiTap16 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Nhập a = ");
        int a = sca.nextInt();

        String KQ = (a%2==0)?"So Chan":"So Le";
        System.out.println(a+" la "+KQ);




    }
}
