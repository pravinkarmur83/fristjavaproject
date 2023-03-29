public class video_28_Multidimensional_Arrays {
    public static void main(String[] args) {
        int[] mark; // a 1-d array che
        int[][] flates; // a 2-D array che
        flates = new int[2][3];
        flates[0][0] = 101;
        flates[0][1] = 102;
        flates[0][2] = 103;
        flates[1][0] = 201;
        flates[1][1] = 202;
        flates[1][2] = 203;
        // 2-D array desplay karva mate for loop no use karsu
        // desplay karva mate 2 for loop use thay jetla diymance hoy atla for loop use thay 3 hoy to 3for loop kara pade
        for (int i = 0; i < flates.length; i++) {
            for (int j = 0; j < flates[i].length; j++) {
                System.out.println(flates[i][j]);
                System.out.println("\n");

            }
            System.out.println(" ");
        }

    }
}
