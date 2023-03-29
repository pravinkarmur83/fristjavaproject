public class video_31_Methods {
//    stetic method stetic mathod direct call thay sake
     int logic(int x , int y){ // ama static no use karva mate stateci ma j call thase matlab k static void ma a fuction call karva mate ama pan stetic lagavel hovu joy nakar error avse
         int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c;
//        vagar stetic lagaye methad call karvi hot to method biji use karvani
        video_31_Methods obj = new video_31_Methods();
        c= obj.logic(a,b);
//        c= logic(a,b); vagar stetic use kayre upar nu call karvanu
        System.out.println(c);
        int a1 = 4;
        int b1 =1;
        int c1;
//        c1 = logic(a1,b1);
//        System.out.println(c1);


    }
}
