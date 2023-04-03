import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ini_fuel=in.nextInt();
        int no_bunk=in.nextInt();
        int []capacity=new int[no_bunk];
        int[] dist=new int[no_bunk];
        for(int i=0;i<no_bunk;i++)
        {
            capacity[i]=in.nextInt();
        }
        for(int i=0;i<no_bunk;i++)
        {
            dist[i]=in.nextInt();
        }
        for(int i=0;i<no_bunk;i++)
        {
            ini_fuel-=dist[i];
            if(ini_fuel<0)
            {
                System.out.println("You are not able to travel");
                return;
            }
            ini_fuel+=capacity[i];
        }
        if(ini_fuel>0) {
            System.out.println("Remaining petrol in car: " + ini_fuel);
        }



    }
}
