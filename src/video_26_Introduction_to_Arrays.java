public class video_26_Introduction_to_Arrays {
    public static void main(String[] args) {


//        thare are tree way to write array

//        first methad 1
        int [] marks;
        marks = new int [5];
        marks[0] = 75;
        marks[1] = 95;
        marks[2] = 85;
        marks[3] = 55;
        System.out.println(marks [2]);

//        second methad 2
        int [] marks1 = new int[5];
        marks1[0] = 75;
        marks1[1] = 95;
        marks1[2] = 65;
        marks1[3] = 55;
        System.out.println(marks1[2]);

//        THIRT METHAD 3
        int [] marks2 = {95,86,75,98,};
        System.out.println(marks2[2]);
    }
}
