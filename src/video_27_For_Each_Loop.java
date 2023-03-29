public class video_27_For_Each_Loop {
    public static void main(String[] args) {
        int [] marks = {78,45,45,87,58};
        System.out.println(marks.length);

        System.out.println("printing using for loop");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("printing using for loop in revers ");
        for (int i= marks.length - 1; i>=0; i--){
            System.out.println(marks[i]);
        }
        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("printing using elements");
        for (int elemets: marks ){
            System.out.println(elemets);
        }

    }
}
