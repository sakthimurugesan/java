class a_39_1
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
class a_39_2 extends a_39_1
{
    public int add(int a,int b)
    {
        return a+b;
    }
}

public class a_39_function_overriding {
    public static void main(String[] args) {
        a_39_2 obj=new a_39_2();
        System.out.println(obj.add(5,7));
    }
}
