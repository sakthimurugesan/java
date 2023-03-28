import java.lang.*;
public class a_5_type_casting {
    /*
    widening casting
        byte -> short -> char -> int -> long -> float -> double
     narrow shortening is opposite direction of wide casting
    *
    * */
    public static void main(String[] args) {
    int a=12;
    double b=a;
    int c=(int)12.12f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
