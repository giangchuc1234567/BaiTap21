import java.util.Scanner;

public class BaiTap28 {
    public static void main(String[] args) {
        double[] mang1;
        double mang2[];
        Scanner sca = new Scanner(System.in);
        mang1 = new double[10];
        int tong=0;
        for (int i=0;i<3;i++){
            System.out.println("nhap mang1 "+i+" = ");
            mang1[i] = sca.nextDouble();
            tong++;
        }
        System.out.println("Tong so trong mang1 = "+tong);

        mang2= new double[]{1,3,3,5,5};
        for (int y=0; y<mang2.length;y++){
            System.out.println(mang2[y]);
        }
    }
}
