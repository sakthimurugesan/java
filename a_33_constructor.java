class demo1
{
    private int x,y;
    demo1()
    {
        this.x=0;
        this.y=0;
        System.out.println("Default constructor created");
    }
    demo1(int xi,int y)
    {
        this.x=0;
        this.y=0;
        System.out.println("Parameterized constructor created");
    }
    demo1(demo1 obj)
    {
        this.x=0;
        this.y=0;
        System.out.println("Copy constructor created");
    }
}
public class a_33_constructor {
    public static void main(String[] args) {
    demo1 obj=new demo1();
    demo1 obj1=new demo1(12,12);
    demo1 obj2=new demo1(obj1);

    }
}
