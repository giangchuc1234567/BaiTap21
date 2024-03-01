import java.util.Scanner;

public class BaiTap15 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Nhap Ban Kinh r = ");
        double r = sca.nextDouble();

        double ChuVi =  2*Math.PI*r;
        System.out.println("Chu Vi = "+ChuVi);
        System.out.println("Chu Vi = "+Math.round(ChuVi));
        System.out.println("Chu Vi = "+Math.round(ChuVi*100.0)/100.0);

        double DienTich = Math.PI * Math.pow(r,2);
        System.out.println("Dien Tich = "+DienTich);
        System.out.println("Dien Tich = "+Math.round(DienTich));
        System.out.println("Dien Tich = "+Math.round(DienTich*100.0)/100.0);


    }
}
