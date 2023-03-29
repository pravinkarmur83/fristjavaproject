import java.util.Scanner;

public class video_16_If_else_Statement {
    public static void main(String[] args) {
//        int b = 9;
//        if (b>18) {
//            System.out.println("You can drive");
//        }
//        else{
//            System.out.println("You are underage!");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age so you can find out you drive or not");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you can drive");
        } else {
            System.out.println("sorry not drive");
        }


    }
}



