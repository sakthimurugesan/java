import java.lang.*;
import java.util.Arrays;

public class a_30_return_array{
    public static int[] array()
    {
        int [] arr={1,2,3,4,5,6,7,8};
        return arr;
    }
    public static void main(String[] args) {

        int [] arr=array();
        System.out.println(Arrays.toString(arr));
    }
}
