import java.util.Scanner;

public class BaiTap20 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a , b ;
        System.out.println("Nhap thang : ");
        a = sca.nextInt();
        System.out.println("Nhap nam : ");
        b = sca.nextInt();

        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Co 30 ngay");
                break;
            case 2:
                if((b%4==0 && b%100!=0)||(b%400==0)){
                    System.out.println("Co 29 ngay");
                }else {
                    System.out.println("Co 28 ngay");
                }
                break;
            default:
                System.out.println("Nhap sai du lieu");
                break;
        }
    }
}
