import java.util.Scanner;

public class a_24_twoD_array
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row,col;
        System.out.print("Enter no of rows : ");
        row=in.nextInt();
        System.out.print("Enter no of columns : ");
        col=in.nextInt();
        int [][] arr=new int[row][col];
        System.out.println("Enter the element of the 2d array");
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print("Enter ["+(i+1)+"]["+(j+1)+"]  ");
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        int [][] arr1=new int[][]{{1,2,3,4,5},{1,2,3,4,5}};

    }
}
