import java.util.Locale;

public class video_14_String_Methods {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('r', 'p'));
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.charAt(3));
        System.out.println(name);


    }
}
