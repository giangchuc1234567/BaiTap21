import java.util.Scanner;

public class BaiTap17 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double a , b ;
        System.out.println("Nhap a = ");
        a = sca.nextDouble();
        System.out.println("Nhap b = ");
        b = sca.nextDouble();

        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            System.out.println("Phuong Trinh Co Nghiem = "+(-b/a));
        }
    }
}
