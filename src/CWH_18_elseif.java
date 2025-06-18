import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String[] args) {
        String var = "ram" ;
        switch (var) {
            case "ram":
                System.out.println("you are going to become and adult!");
                break;
            case "shyam":
                System.out.println("you are going to join a job");
                break;
            case "hari":
                System.out.println("you are going to retired!");
                break;
            default:
                System.out.println("enjoy your life");
                break;
        }
//        int age;
//        System.out.println("Enter Your Age: ");
//        Scanner sc = new Scanner(System.in);
//        age = sc.nextInt();
//        // if else ladder
//        if (age>56) {
//            System.out.println("you are experienced!");
//        }
//        else if (age>46) {
//        System.out.println("you are semi-experienced");
//        }
//        else if (age >36) {
//            System.out.println("you are semi-semi-experienced!");
//        }
//        else{
//            System.out.println("you are not experienced!");
//        }

        int age;
        System.out.println("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18 :
                System.out.println("you are going to become an adult");
                break ;
            case 23 :
                System.out.println("you are going to become an adult");
                break ;
            case 60 :
                System.out.println("you are going to retireed!");
                break ;
            default:
                System.out.println("enjoy your life");
        }
        System.out.println("thanks for using my java code!");
    }
}
