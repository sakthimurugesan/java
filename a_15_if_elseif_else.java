import java.util.Scanner;
public class a_15_if_elseif_else {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if((a>b) && (a>c))
        {
            System.out.println("A is greater than b and c");
        }
        else if((b>c) && (b>a))
        {
            System.out.println("B is greater than a and c");
        }
        else{
            System.out.println("C is greater than a and b");
        }

    }
}
