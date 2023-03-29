import java.util.Scanner;
public class video_18_Switch_Case_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age to verify that you are expiriance or not");
        int a = sc.nextInt();

        switch (a){
            case 18:
                System.out.println("availeble");
                break;
            case 26:
                System.out.println("idata");
                break;
            case 56:
                System.out.println("availe");
                break;
        }
        System.out.println("finish");


//        if (a>56){
//            System.out.println("you are expirianced ");
//        }
//        else if (a>36) {
//            System.out.println("you are semi- expirianced");
//        }
//        else if (a>26) {
//            System.out.println("you are semi-semi-expirianced");
//            }
//        else {
//            System.out.println("you are not expirianced");
        }

    }

