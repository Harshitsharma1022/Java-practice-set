import java.util.Scanner;

public class CWH_11_ex1_sol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your marks in physics");
        float physics =scan.nextFloat();
        System.out.println("enter your marks in chemistry");
        float chemistry =scan.nextFloat();
        System.out.println("enter your marks in maths");
        float maths =scan.nextFloat();
        System.out.println("enter your marks in english");
        float english =scan.nextFloat();
        System.out.println("enter your marks in hindi");
        float hindi =scan.nextFloat();
        float percentage = (physics + chemistry + maths + english + hindi)/500 * 100;
        System.out.println("percentage in all te subject :");
        System.out.println(percentage);
    }

}
