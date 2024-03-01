import java.util.Scanner;

public class BaiTap27 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n=0;
        try {
            System.out.println("Nhap so nguyen n>0 ");
            n=sca.nextInt();
        }catch (Exception e){
            System.out.println("Nhap sai du lieu");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("Gia Tri n = "+n);
        System.out.println("Ket Thuc Chuong Trinh");
    }
}
