import java.util.Scanner;

public class BaiTap24 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Nhap vao so a > 0 ");
        int a = sca.nextInt();

        String Nhiphan = "";
        while (a>0){
            Nhiphan= (a%2) + Nhiphan;
            a=a/2;
        }
        System.out.println("So Nhi Phan cua a : "+Nhiphan);
    }
}
