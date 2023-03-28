import java.util.Scanner;

public class a_19_do_while {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a positive number   ");
        int a=in.nextInt();
        do {
            System.out.println("Hello");
        }while ( a<0);

    }
}
