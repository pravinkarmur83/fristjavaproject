public class video_34_Recursion {
    //factorial (0) = 1 factorial 0 ni value hamesa 1 hoy che
    // factorial (n) = n * n-1 * ...1 a dactorial niu formula he avi rite e calculate thay che
    //factorial (5) = 5 * 4 * 3 * 2 * 1 // a rite factorial calculate thay che ane java niche pramne lakhay
    //factorial (n) = n * factorial(n-1)
        static int factorial (int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(" factorial valeu of n is " + factorial(n));
    }
}
