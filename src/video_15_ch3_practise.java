public class video_15_ch3_practise {
    public static void main(String[] args) {
//        Question 1
        String name = "Pravin Karmur";
        name = name.toLowerCase();
        System.out.println(name);

//        Question 2
        String b = "To Lower Case";
        b = b.replace(" ", "_");
        System.out.println(b);

//        Question 3
        String latter = "Dear <|name|> thank tou for your service";
        b = latter.replace("<|name|>", "Pravin");
        System.out.println(b);

//        Question 4
        String sp = " my name  is pra vin ";
        System.out.println(sp.indexOf("  "));

//        Question 5
        String latter1 = "dear pravin \n\tyour program is very good \n\tthanks";
        System.out.println(latter1);

    }
}
