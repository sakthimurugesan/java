class rectangle{
    private int l,b;
    public int getLength()
    {
        return l;
    }
    public int getBreath()
    {
        return b;
    }
    public void setLength(int l)
    {
        this.l=l;
    }
    public void setBreadth(int b)
    {
        this.b=b;
    }
}

public class a_32_getter_setter {
    public static void main(String[] args)
    {
        rectangle obj=new rectangle();
        obj.setBreadth(12);
        obj.setLength(12);
        System.out.println(obj.getBreath());
        System.out.println(obj.getLength());
    }
}
