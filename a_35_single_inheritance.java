class father
{
    void house()
    {
        System.out.println("father\'s  house");
    }
}
class son extends father
{
    void bike()
    {
        System.out.println("son\'s bike");
    }
}
public class a_35_single_inheritance {
    public static void main(String[] args) {
        son obj=new son();
        System.out.println("Calling using son\'s object ");
        obj.house();
        obj.bike();
    }
}
