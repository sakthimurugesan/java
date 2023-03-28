import java.util.Scanner;
public class a_25_string {
    public static void main(String[] args) {
        String s="Hello world !!";
        String s1="Hello world !!";
        System.out.println(s.hashCode()); // hashCode is used to print address of the variables
        System.out.println(s1.hashCode());
        System.out.println(s);
        System.out.println(s1);
        System.out.println("Equals\t"+(s1.equals(s))); //
        System.out.println("Equals ignore cases\t"+s1.equalsIgnoreCase(s));
        System.out.println("Length\t"+s1.length());
        System.out.println("charAt(1)"+s.charAt(1));
        System.out.println("Uppercase\t"+s.toUpperCase());
        System.out.println("Lowercase\t"+s1.toLowerCase());
        System.out.println("Replace world with wow\t"+s1.replace("world","wow"));
        System.out.println("Repeat\t"+s1.repeat(5));
        System.out.println("Contains\t"+s1.contains("Hello"));
        System.out.println("Empty\t"+s1.isEmpty());



    }
}
