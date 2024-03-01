import java.util.Scanner;

public class BaiTap23 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = 1;
        while (a!=0){
            System.out.println("Nhap a = 0 de thoat.");
            a= sca.nextInt();
        }
        System.out.println("Da thoat");

        int b = 0;
        while (true){
            System.out.println(b);
            b++;
            if(b==5)
                break;
        }
    }
}
