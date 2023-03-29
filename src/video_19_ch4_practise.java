import java.util.Scanner;
public class video_19_ch4_practise {
    public static void main(String[] args) {
//        Question 1
//        int a = 10;
//        if (a==11){
//            System.out.println("i m 11");
//        }
//        else {
//            System.out.println("i m not 11");
//        }

//        Question 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the subject wise mark");
//        System.out.println("subject 1");
//        float sub1 = sc.nextFloat();
//        System.out.println("subject 2");
//        float sub2 = sc.nextFloat();
//        System.out.println("subject 3");
//        float sub3 = sc.nextFloat();
//        float total = (sub1 + sub2 + sub3) / 3.0f;
//        System.out.println("total taka " + total);
//        if (sub1<=33){
//            System.out.println("you fail in sub 1");}
//        if (sub2<=33){
//            System.out.println("you fail in sub 2");}
//        if (sub3<=33){
//            System.out.println("you fail in sub 3");
//
//        }
//        if (total>=40 && sub1>33&&sub2>33&&sub3>33){
//            System.out.println("congratulation you pass");
//        }
//        else{
//            System.out.println("sorry better luck next time");
//
//        }
//        Question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your income");
//        float income = sc.nextFloat();
//        float tax = 0;
//        if (income <= 250000) {
//            tax = tax + 0;
//        }
//        else if (income > 250000 && income <=500000) {
//            tax = tax + 0.05f * (income - 500000);
//        }
//        else if (income > 500000 && income <= 100000) {
//            tax = tax + 0.05f * (income - 250000);
//            tax = tax + 0.2f * (income - 500000);
//        }
//        else if (income > 1000000) {
//            tax = tax + 0.05f * (income - 250000);
//            tax = tax + 0.2f * (income - 500000);
//            tax = tax + 0.3f * (income - 1000000);}
//
//            System.out.println("payelble tex " + tax);

//        Question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("inter the day number");
//        int day = sc.nextInt();
//        switch (day){
//            case 1:{
//                System.out.println("monday");
//                break;
//            }
//            case 2:{
//                System.out.println("tuesday");
//                break;
//            }case 3:{
//                System.out.println("tuesday");
//                break;
//            }case 4:{
//                System.out.println("Wednesday");
//                break;
//            }case 5:{
//                System.out.println("thursday");
//                break;
//            }case 6:{
//                System.out.println("friday");
//                break;
//            }case 7:{
//                System.out.println("saturday");
//                break;
//            }case 8:{
//                System.out.println("sanday");
//                break;
//            }
//        Question 5
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the year ");
//        int a = sc.nextInt();
//        if (a % 4== 0){
//            System.out.println("this is leap year");
//             }
//        else {
//            System.out.println("this is not leap year");
//        }

//        Question 6
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        if (website.endsWith(".com")){
            System.out.println("this domain is commarcial website");
        } else if (website.endsWith(".org")) {
            System.out.println("this is orgenise website");

        } else if (website.endsWith(".in")) {
            System.out.println("this is a indian wesite");

        }


    }



    }
