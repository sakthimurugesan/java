import java.util.Scanner;

public class a_18_while_loop {
    public static void main(String[] args) {
        System.out.print("Enter a number    ");
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int i=1;
        while(i<=a)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(j+" ");
                j++;
            }
            System.out.print('\n');
            i++;
        }

    }
}
