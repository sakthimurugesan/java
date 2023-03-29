class a
{
    a()
    {
        System.out.println("A constructor");
    }
}
class b extends a
{
    b()
    {
        System.out.println("B constructor");
    }
}
class c extends b
{
    c()
    {
        System.out.println("C constructor");
    }
}
public class a_36_multiple_inheritance {
    public static void main(String[] args) {
    System.out.println("C class object ");
    c obj=new c();

    }
}
