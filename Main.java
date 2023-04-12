import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*import java.util.Scanner;

class Main
{
    public static void space(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print(" ");
        }
    }
    public static void star(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print("* ");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            space(i);
            star(n-i);
            System.out.print('\n');
        }
        for(int i=1;i<=n;i++)
        {
            space(n-i);
            star(i);
            System.out.print('\n');
        }
    }
}*/

/*
class Main
{
    public static void space(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(" ");
        }
    }

    public static void printChar(int n)
    {
        System.out.print((char)(n+1));
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char c=in.next().charAt(0);
        int spc=(int)c-65,i=0;
        int spaceBetween=1;
        space(spc);
        spc-=1;
        System.out.print("A\n");
        for(i=65;i<=(int)c-1;i++)
        {
            space(spc);
            printChar(i);
            space(spaceBetween);
            printChar(i);
            System.out.print('\n');
            spc-=1;
            spaceBetween+=2;

        }
        spaceBetween-=4;
        spc+=2;
        for(i=i-2;i>=65;i--)
        {
            space(spc);
            printChar(i);
            space(spaceBetween);
            printChar(i);
            System.out.print('\n');
            spaceBetween-=2;
            spc+=1;
        }
        space(spc);
        spc-=1;
        System.out.print("A\n");


    }
}
*/
/*
class Main
{
    public static void space(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print("  ");
        }
    }

    public static void star(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        for(i=1;i<=n;i++)
        {
            star(i);
            space(n-i);
            star(i);
            System.out.print('\n');
        }
        for(i=i-2;i>=1;i--)
        {
            star(i);
            space(n-i);
            star(i);
            System.out.print('\n');
        }
    }
}

 */

/*

class Main
{
    public static void star(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
    }
    public static void B(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print("b");
        }
    }
    public static void printI(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print("i");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        star(2*n-1);
        System.out.print('\n');
        for(int i=1;i<=n-2;i++)
        {
            B(i);
            star(1);
            printI(2*n-2*i-3);
            star(1);
            B(i);
            System.out.print('\n');
        }
        B(n-1);
        star(1);
        B(n-1);

    }
}
 */
/*
class Main
{
    public static void lineOfStars(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println("  *");
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        lineOfStars(n);
        for(int i=1;i<=2*n-1;i++)
        {
            System.out.print("*");
        }
        System.out.print('\n');
        lineOfStars(n);


    }
}

 */

// You are using Java

/*
import java.util.Scanner;
class Main
{
    public static void space(int n)
    {
        for (int i=1;i<=n;i++)
        {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int spaceBefore=n-2;
        space(spaceBefore);
        System.out.print("*\n");
        spaceBefore-=1;
        int spaceBetween=1;
        for(int i=2;i<n;i++)
        {
            space(spaceBefore+1);
            System.out.print("*");
            space(spaceBetween);
            System.out.print("*");
            System.out.print('\n');
            spaceBefore-=1;
            spaceBetween+=2;
        }
        for(int i=1;i<=2*n-1;i++)
        {
            System.out.print("*");

        }

    }
}

 */
/*
 #include<stdio.h>

#include<conio.h>

int main()

{

int N;

printf(“Enter total number of cards : “);

scanf(“%d”, &N);

if(N < 1 || N > 52)

{

 printf(“Invalid Input”);

 return 0;

}

int A[N];

printf(“Enter the values on the cards that are turned: \n”);

for(int i = 0; i < N; i++)

{

 scanf(“%d”, &A[i]);

 if(A[i] < 1 || A[i] > 13)

 {

  printf(“Invalid Input”);

  return 0;

 }

}

int Point_A = 0, Point_B = 0;

for(int i = 0; i < N; i++)

{

 if(i%2 == 0)

 {

  if(A[i] == 1 && A[i+1] < 11 && A[i+1] != 1 && A[i+2] < 11 && A[i+2] != 1 && A[i+3] < 11 && A[i+3] != 1 && A[i+4] < 11 && A[i+4] != 1)

  {

   printf(“Player A scores 4 points.\n”);

   Point_A = Point_A + 4;

  }

  if(A[i] == 13 && A[i+1] < 11 && A[i+1] != 1 && A[i+2] < 11 && A[i+2] != 1 && A[i+3] < 11 && A[i+3] != 1)

  {

   printf(“Player A scores 3 points.\n”);

   Point_A = Point_A + 3;

  }

  if(A[i] == 12 && A[i+1] < 11 && A[i+1] != 1 && A[i+2] < 11 && A[i+2] != 1)

  {

   printf(“Player A scores 2 points.\n”);

   Point_A = Point_A + 2;

  }

  if(A[i] == 11 && A[i+1] < 11 && A[i+1] != 1)

  {

   printf(“Player A scores 1 point.\n”);

   Point_A = Point_A + 1;

  }

 }

 else

 {

  if(A[i] == 1 && A[i+1] < 11 && A[i+1] != 1 && A[i+2] < 11 && A[i+2] != 1 && A[i+3] < 11 && A[i+3] != 1 && A[i+4] < 11 && A[i+4] != 1)

  {

   printf(“Player B scores 4 points.\n”);

   Point_B = Point_B + 4;

  }

  if(A[i] == 13 && A[i+1] < 11 && A[i+1] != 1 && A[i+2] < 11 && A[i+2] != 1 && A[i+3] < 11 && A[i+3] != 1)

  {

   printf(“Player B scores 3 points.\n”);

   Point_B = Point_B + 3;

  }

  if(A[i] == 12 && A[i+1] < 11 && A[i+1] != 1 && A[i+2] < 11 && A[i+2] != 1)

  {

   printf(“Player B scores 2 points.\n”);

   Point_B = Point_B + 2;

  }

  if(A[i] == 11 && A[i+1] < 11 && A[i+1] != 1)

  {

   printf(“Player B scores 1 point.\n”);

   Point_B = Point_B + 1;

  }

 }

}

printf(“Player A = %d point(s)\n”, Point_A);

printf(“Player B = %d point(s)”, Point_B);

return 0;

}
 */
class Main
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.print('\n');
        }
    }
}