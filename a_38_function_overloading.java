public class a_38_function_overloading {
    public static void hello()
    {
        System.out.println("Hello from function 1");
    }
    public static void hello(int a)
    {
        System.out.println("Hello from function 2");
    }
    public static int hello(int a,int b)
    {
        System.out.print("Hello from function 3");
        return 0;
    }
    public static void main(String[] args) {
        hello();
        hello(5);
        hello(5,7);
    }
}
