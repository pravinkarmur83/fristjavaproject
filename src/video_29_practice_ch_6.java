import java.util.Scanner;
public class video_29_practice_ch_6 {
    public static void main(String[] args) {

//        Question 1
        /*float [] marks = {50.5f, 50.5f, 50.5f, 50.5f, 50.5f,};
        float sum = 0;
        for (float elements: marks){
            sum = sum + elements;
            System.out.println(sum);
        }

      System.out.println(sum);*/

//        Question 2
//        me a program ne modify karel che ama user input lidhel che
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check it is in array or not");
        float num = sc.nextFloat();
        boolean array = false;
        float [] marks = {50.5f, 50.5f, 50.5f, 50.5f, 50.5f,};
        for (float elements: marks){
            if (num==elements){
                array = true;
                break;
            }
        }
        if (array){
            System.out.println(" value is present in the array ");
        }
        else{
            System.out.println(" value is not present in the array ");
        }

//        Question 3
        float [] marks = {50.5f, 50.5f, 60.5f, 50.5f, 50.5f,};
        float sum = 0;
        for (float elements: marks){
            sum = sum + elements;
       //     System.out.println(sum);
        }

        System.out.println(sum/marks.length);

//        Question 4

        int[][] mat1 = {{1, 5, 8},
                {5, 5, 5}};
        int[][] mat2 = {{1, 5, 8},
                {15, 5, 5}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];}}
                for (int i = 0; i < mat1.length; i++) { // row number of times
                    for (int j = 0; j < mat1[i].length; j++) { // column number of time
                        System.out.print(result[i][j] + " ");
                        result[i][j] = mat1[i][j] + mat2[i][j];

                    }
                    System.out.println(" ");

//        Question 5
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

//        Question 5
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int max = 0;
        for (int e: arr){
            max= e;
        }
        System.out.println(max);

//        Question 6 &7
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int min = Integer.MAX_VALUE;
        for (int e: arr){
            if (e>min)
            min= e;
        }
        System.out.println(min);

//        Question 8
        boolean isshorted = true;
        int [] arr = {1, 2, 3, 45, 5, 34, 67};
        for (int i =0; i< arr.length -1; i++){
            if (arr[i] > arr[i+1]){
                isshorted = false;
                break;
            }

        }
        System.out.println(isshorted);
*/

    }
}


