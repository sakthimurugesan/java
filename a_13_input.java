import java.util.Scanner;

public class a_13_input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); //creating object for scanner class
        int a,b,c;
        float f;
        double d;
        String s;
        a=in.nextInt(); // accessing nextInt() function to get integer as input
        b=in.nextInt();
        f=in.nextFloat(); // accessing nextFloat() function to get float as input
        d= in.nextDouble(); // accessing nextDouble() function to get double as input
        s=in.next(); // accessing next() function to get one word as input
        // accessing nextLine() function to get one line as input
        System.out.println(s);

    }
}
