import java.util.*;
public class MinElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int min1=100000;
        int c;
        for(int i=0;i<n;i++)
        {
            c=in.nextInt();
            min1=c<min1?c:min1;
        }
        System.out.print(min1);
    }
}
