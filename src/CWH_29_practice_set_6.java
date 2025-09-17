public class CWH_29_practice_set_6 {
    public static void main(String[] args) {


//        System.out.println("practice problem 1: \n");
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("sum of all the number is :" + sum);


//        System.out.println("practice problem 2: \n");
        float[] marks1 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for (float element : marks1) {
            if(num == element){
                isInArray= true;
                break;
            }
        }
        if(isInArray){
            System.out.println(num+ " is present in the array.");
        }
        else{
            System.out.println(num+ " is not present in the array.");
        }


//        System.out.println("practice problem 3: \n");
        float[] marks2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum1 = 0;
        for (float element : marks2) {
            sum1 = sum1 + element;
        }
        System.out.println("the value of average marks is : " + sum1 / marks.length);


//        System.out.println("practice problem 4: \n");
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d\n",i ,j );
                result [i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result [i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }

    }
}
