import java.util.Scanner;
public class a_14_if_statement {
    public static void main(String[] args) {
        int a;
        Scanner in =new Scanner(System.in);
        // classname objectname = new(keyword) Classname();
        a=in.nextInt();
        if(a>=18)
        {
            System.out.println("You are eligble for voting");
        }
        else
        {
            System.out.println("You are not eligble for voting");
        }
    }
}
