public class video_32_Method_Overloading {

    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning " + a + "bro");
    }
    static void foo(int a, int b){
        System.out.println("good morning " + a + " bro");
        System.out.println("good morning " + b + " bro");
    }

//    static void telljock(){ //a mathad ma void fuction check karva mate nu che
//        System.out.println("this is a jock");
    static void chenge (int a){ //ama method ma int fuction check karva mate che k jo ane call kari to a ni valu checnge thay che k nyt
        a =24;

    }
    static void chenge2(int arr){
        arr = 85;
    }
//    static void chenge ();

    public static void main(String[] args) {
 //    telljock(); // static void direct ji hoy e print kari dye sidhu call call kare void fuction

//        method for chenge int mate ama velue check karv amte

        // Methad chenging the int
//        int a = 54;
//        chenge(a);
//        System.out.println("atiyare chenge method call kyroi tyarni value " + a);// a result che int nu value chenge nathi thati pan arrey ma avu nathi ema chenge thay jahe

       // method 2 changeing the array
        int [] marks = {52,85,84,65,45};//jyare arry ma chenge method no use karo tyare velue chenge thay jahe karnk k array akhu group reprent kare khali refenrc tarik kam kare he
//        chenge2(marks[]);


//        Method Oveloading
        foo(); // khali foo call karso to first static  run thase etle k good moring thase output
        foo(300);// jo a foo run karsu a ni jagya ji value nakhsu e teni sathe run thay jase anae over loading kevay

    }
}

