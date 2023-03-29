class A{
    void print(String name,int age)
    {
        System.out.println("Name\t"+name);
        System.out.println("age\t"+age);
    }
}
public class a_34_array_objects {
    public static void main(String[] args) {
        A[] a=new A[5];
        a[0]=new A();
        a[0].print("sakthi",19);
        a[1]=new A();
        a[1].print("sanjay",19);
        a[2]=new A();
        a[2].print("saran",18);
        a[3]=new A();
        a[3].print("rohit",20);
        a[4]=new A();
        a[4].print("narendran",17);
    }
}
