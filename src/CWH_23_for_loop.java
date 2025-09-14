import java.util.Scanner;

public class CWH_23_for_loop {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
//        2n = Even number 2 4 6 8 10
//        2n+1 = Odd number 1 3 5 7 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("first" + n + "Odd numbers is:");
        for(int i=0 ; i < n ; i++){
            System.out.println(2*i+1);
        }

        for (int i = 5; i>0; i--){
            System.out.println(i);
        }
    }
}