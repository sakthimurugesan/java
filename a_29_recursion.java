import java.util.Scanner;

public class a_29_recursion {
    public static int fact(int n){
        if(n==1) {
            return 1;
        }
        else {
            return n*fact(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter a number   ");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int f=fact(n);
        System.out.println("Factorial of "+n+" is "+f);
    }
}
