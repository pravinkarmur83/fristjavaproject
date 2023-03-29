public class video_33_Variable_Arguments_VarArgs {
//    static int sum (int a , int b){
//        return a+b;
//    }
//    static int sum (int a , int b , int c){
//        return a+b+c;
//    }
    static int sum (int...arr) { //simple che a fuction atle banava ava karnak varm varm apde alg alg stetic banvai ne call na karvu ano simpke  use e he koy pan stetic fuction bane to ema jetla int hoy atla j sum thay ethi vadhre sankhya na no sum karv karvoi to ...arr fution use kari atle alag alag static no use karvani jarur na pade

        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcom to varargs");
        System.out.println("the sum of 4 and 5 is " + sum(4,5));
        System.out.println("the sum of 4 and 5 is " + sum(5,5,5,6,7));
    }
}
