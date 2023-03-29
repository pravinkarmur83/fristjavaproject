public class Video_24_break_and_continue {
    public static void main(String[] args) {
//        for (int a = 1; a < 5; a++) {
//            System.out.println(a);
//            if (a == 3) {
//                System.out.println("end for loop");
//                break;


        int a = 0;
//        while (a < 5) {
//            System.out.println(a);
//            System.out.println("while print ");
//            a++;

        do {
            a++;
            if (a == 2) {
//                System.out.println("l");
                System.out.println("print a");
                continue;
            }
            System.out.println("frist loop print");
            System.out.println(a);
        }while (a<5);
    }
}
