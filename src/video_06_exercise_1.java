
import java.util.Scanner;
public class video_06_exercise_1 {
    public static void main(String[] args) {
        System.out.println("this is program for partege calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Subject 3");
        int sub3 = sc.nextInt();
        System.out.println("Subject 4");
        int sub4 = sc.nextInt();
        System.out.println("Subject 5");
        int sub5 = sc.nextInt();
        System.out.println("toal sum marks out of 100");
        int total = sub1+sub2+sub3+sub4+sub5;
        int partege = total*100/500;
         System.out.println(total);
        System.out.println(partege);
    }
}
