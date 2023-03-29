import java.awt.*;
import java.util.Scanner;

class shape{
    public int l,b;
    public Scanner in =new Scanner(System.in);
    public int rect_area(int l,int b)
    {
        this.l=l;
        this.b=b;
        return this.l*this.b;
    }
    public void get()
    {
        System.out.print("Enter the length");
        l=in.nextInt();
        System.out.print("Enter the breadth");
        b=in.nextInt();
        System.out.println(this.rect_area(l,b));


    }


}

public class a_31_classes {
    public static void main(String[] args) {
        shape s= new shape();
        s.get();
    }
}
