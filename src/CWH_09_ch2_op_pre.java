public class CWH_09_ch2_op_pre {
    public static void main(String[] args) {
//       precedence and associativity
//        int a = 6*5-34/2;
       /*
       Highes precedence goes to * and /. they are then evaluated on the
        basis of left to right associativity
        =38-34/2
        =38-17
        =13
        */
//       int b=68/5-34*2;
        /*
        =12-34/*2
        =12-68
        =-56
    */
//        System.out.println(a);
//        System.out.println(b);
        //quick quiz
        int x=6;
        int y=1;
        //int k = x* y/2;
        int b = 0;
        int c = 0;
        int a = 0;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);
    }
}
