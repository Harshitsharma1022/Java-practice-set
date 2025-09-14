import java.util.Scanner;

public class practice_set4_Q6 {
    public static void main(String[] args) {
        System.out.println("enter any website e.g.(.com , .org , .in :");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("it is a commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("it is a organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("it is a Indian website");
        }
        else {
            System.out.println("farzii just like u");
        }
    }
}
