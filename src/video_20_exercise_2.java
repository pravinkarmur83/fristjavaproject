import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class video_20_exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        Random ran = new Random();
//        int a  = 1; roack
//        int b = 2; paper
//        int c = 3; scissor
        int user_input = sc.nextInt();
        int input1 = ran.nextInt(3);
        if (user_input>input1){
            System.out.println("you win");
        }
        System.out.println("ran " + input1); int user_input1= sc.nextInt();
        int input2= ran.nextInt(3);
        if (user_input1>input2){
            System.out.println("you win");
        }
        System.out.println("ran " + input2); int user_input2= sc.nextInt();
        int input3 = ran.nextInt(3);
        if (user_input2>input3){
            System.out.println("you win");
        }
        System.out.println("ran " + input3);
        System.out.println("select\n rok for 0\n paper for 1\n scissor for 2");
        }
    }


