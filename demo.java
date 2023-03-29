import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        float a,b,c,d;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        float e=a+b+c+d;
        System.out.println("Total expenses : Rs."+(e));
        System.out.println("Branding expenses percentage : "+String.format("%.2f",(e/100)*a)+"%");
        System.out.println("Travel expenses percentage : "+String.format("%.2f",(e/100)*b)+"%");
        System.out.println("Food expenses percentage : "+String.format("%.2f",(e/100)*c)+"%");
        System.out.println("Logistics expenses percentage : "+String.format("%.2f",(e/100)*d)+"%");


    }
}