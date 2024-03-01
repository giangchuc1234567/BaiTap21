import java.util.Scanner;

public class BaiTap09 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Nhap Ho Va Ten : ");
        String HoVaTen = sca.nextLine();
        System.out.println("Nhap Ma Sinh Vien : ");
        long MaSinhVien = sca.nextLong();
        System.out.println("Nhap Diem Thi");
        float DiemThi = sca.nextFloat();

        System.out.println(" -------------- ");
        System.out.println("Ho Va Ten : "+ HoVaTen);
        System.out.println("Ma Sinh Vien : " + MaSinhVien );
        System.out.println("Diem Thi : "+ DiemThi);

    }
}
