import java.util.Scanner;

public class CWH_22_ch4_do_while {
    public static void main(String[] args) {
        int a = 1;
        do{
            System.out.println(a);
            a++;

        }while(a<5);
//Quick Quiz
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("first" + n + "natural numbers:");
        do{
            System.out.println(i + " ");
            i++;
        }while(i<=n);
    }
}
