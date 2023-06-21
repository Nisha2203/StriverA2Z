import java.util.Scanner;

public class Pattern20  {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter number of rows ");
    int row = in.nextInt();
    for(int i=1;i<=row;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=2*(row-i);j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<row;i++)
    {
        for(int j=1;j<=row-i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=2*i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=row-i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
