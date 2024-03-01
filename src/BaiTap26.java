import java.util.Scanner;

public class BaiTap26 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int in , out=0;
        for (in =0 ; in <9 ; in ++){
            for (out = 0 ; out<15 ; out++){
                if(out>10)
                    break;
            }
            System.out.println("Break ; Ben trong vong lap in = "+in+" out = "+out);
        }
        System.out.println("Break ; Ben ngoai vong lap in = "+in +" out = "+out);


        int a , b=0;
        outer: for (a =0 ; a <9 ; a ++){
            for (b = 0 ; b<15 ; b++){
                if(b>10)
                    break outer;
            }
            System.out.println("break outer; Ben trong vong lap a = "+a+" b = "+b);
        }
        System.out.println("break outer; Ben ngoai vong lap a = "+a +" b = "+b);

        int c , d=0;
         for (c =0 ; c <9 ; c ++){
            for (d = 0 ; d<15 ; d++){
                if(d>10)
                    continue ;
            }
            System.out.println("continue ; Ben trong vong lap c = "+c+" d = "+d);
        }
        System.out.println("continue ; Ben ngoai vong lap c = "+c +" d = "+d);

        int e , f=0;
        outer : for (e =0 ; e<9 ; e ++){
            for (f = 0 ; f<15 ; f++){
                if(f>10)
                    continue outer ;
            }
            System.out.println("continue outer ; Ben trong vong lap e = "+e+" f = "+f);
        }
        System.out.println("continue outer ; Ben ngoai vong lap e = "+e +" f = "+f);

        int g , h=0;
         for (g =0 ; g<9 ; g ++){
            for (h = 0 ; h<15 ; h++){
                if(h>1)
                    return;
                System.out.println("return g = "+g +" h = "+h);
            }
            System.out.println("return ; Ben trong vong lap g = "+g+" h = "+h);
        }
        System.out.println("return ; Ben ngoai vong lap g = "+g +" h = "+h);
    }
}
