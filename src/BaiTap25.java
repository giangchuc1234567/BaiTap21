import java.util.Scanner;

public class BaiTap25 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a;
        do {
            System.out.println("Nhap a < 0");
            a = sca.nextInt();
        }while (a>=0);
    }
}
