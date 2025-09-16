public class CWH_27_arrays {
    public static void main(String[] args) {
        /*float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        String [] student = {"Harry" , "Rohan" , "Shubham" , "Lavish"};
        System.out.println(student.length);
        System.out.println(student[3]);
         */

        int [] marks1 = {98, 45, 79, 99, 80};
//        System.out.print("The length of the array: ");System.out.println(marks1.length);
//        easy way of displaying the array
        System.out.println("printing using Nive way (easy way)");
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);
        System.out.println(marks1[4]);

//        displaying the array (for loop)
        System.out.println("printing using for loop");
        for(int i=0;i< marks1.length;i++){
            System.out.println(marks1[i]);
        }
//        displaying the array in Reverse order (for loop)
        System.out.println("printing using for loop in Reverse order");
        for(int i=marks1.length - 1;i>=0;i--) {
            System.out.println(marks1[i]);
        }
//        displaying the array (for-each loop)
        System.out.println("printing using for-each loop");
        for (int element: marks1) {
            System.out.println(element);
        }
    }
}
