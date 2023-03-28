import java.util.Scanner;

public class a_22_break_continue {
    public static void main(String[] args) {
        System.out.print("Enter a number  10 to 15");
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(i==8)
            {
                System.out.println("reached break");
                break;
            }
            System.out.print(i+" ");



        }
        for(int i=1;i<=a;i++)
        {

            if(i==8)
            {

                System.out.print("reached continue ");
                continue;
            }
            System.out.print(i+" ");

        }
    }
}
