import java.lang.reflect.Array;
import java.util.Scanner;

public class a_23_oneD_array {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(i+" ");
        }
        System.out.print('\n');
        for(int i:a)
        {
            System.out.print(i+" ");
        }

        System.out.print('\n');
        /*
        array declaration with size
        */

        int []b=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter "+i+" number  ");
            b[i]=in.nextInt();

        }
        for(int i:b)
        {
            System.out.print(i+" ");
        }

        int []c=new int[]{1,2,3,4,5,6,7,8};




    }
}
