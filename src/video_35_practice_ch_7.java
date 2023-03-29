public class video_35_practice_ch_7 {
    static void multiplication (int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d \n", n, i, n * i);
        }

    }
    static void pattern (int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.println("*");
            }
            System.out.println();

        }
    }
    static int sumrec (int n){
        if(n==1){ // ane base condition keva jo a no lagav to n-1 maines ma haylu jay recurection a condition lagavi joye farijiyat
            return 1;
        }
        else{
            return n + sumrec(n-1);
        }
    }
    static int fib (int n){
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else {
            return  fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        //Question 1
//        multiplication(12);

        // Question 2
//        pattern(4);

        //Question 3
//        int c = sumrec(3);
//        System.out.println(c);

        //Question 5
        //fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int result = fib(3);
//        System.out.println(result);

        //Question 8

    }
}
