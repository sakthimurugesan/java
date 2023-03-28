import java.util.Scanner;

public class a_20_for_loop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number   ");
        int a=in.nextInt();
        for(int i=1;i<=a;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print('\n');
        }
    }
}
