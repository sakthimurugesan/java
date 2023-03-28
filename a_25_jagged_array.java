public class a_25_jagged_array {
    public static void main(String[] args)
    {
        int [][] arr=new int [][]
                {
                {1,2,3,4},
                {1,2,3,4,5},
                {1,2,3}

                };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print('\n');
        }
        System.out.print("Using for each loop");
        for(int k[]:arr)
        {
            for(int l:k)
            {
                System.out.print(l+" ");
            }
            System.out.print('\n');
        }
    }
}
