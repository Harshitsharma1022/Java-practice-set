public class CWH_17_logical {
    public static void main(String[] args) {

        System.out.println("For Logical AND...");
        boolean a = true;//true true me true hota h baki sab me false hota h
        boolean b = false;
        //AND operator
        if (a && b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        //OR operator  (false false me no hota h baki sab me true hota h)
        System.out.println("For Logical OR...");
        if (a || b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //NOT operator
        System.out.println("For Logical NOT...");
        System.out.println("Not(a) is");
        System.out.println(!a);
        System.out.println("Not(b) is");
        System.out.println(!b);
    }
}
