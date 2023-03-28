import java.util.Scanner;

public class a_17_group_switch {
    public static void main(String[] args) {
        System.out.print("Enter a character \t");
        Scanner in=new Scanner(System.in);
        char c=in.next().charAt(0);
        switch (c)
        {
            case 'a':
            case 'A':
            case 'E':
            case 'e':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("Not Vowels");
                break;

        }

    }
}
