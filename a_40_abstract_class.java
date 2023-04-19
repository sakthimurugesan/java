abstract class a_40_abstract_class_1
{
    public abstract void draw();
    void greet()
    {
        System.out.println("Greetings");
    }
}
class a_40_abstract_class_2 extends a_40_abstract_class_1
{
    @Override
    public void draw()
    {
        System.out.println("Draw");
    }
}
public class a_40_abstract_class {

    public static void main(String[] args) {
        a_40_abstract_class_2 obj =new a_40_abstract_class_2();
        obj.draw();
        obj.greet();
    }
}
