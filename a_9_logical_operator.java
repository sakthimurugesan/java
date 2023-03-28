public class a_9_logical_operator
{
    public static void main(String[] args)
    {
        int a=1,b=2;
        System.out.println("a\t"+a+"\tb\t"+b);
        System.out.println("a>b || a<b\t"+(a>b || a<b));
        System.out.println("a<b && a==1\t"+(a<b && a==1));
        System.out.println("!(a<b && a==1)\t"+!(a<b && a==1));

    }
}
  