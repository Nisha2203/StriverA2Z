import java.util.Scanner;

public class Rhombus9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int row = in.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=i;j<row;j++)
            {
                System.out.print(" ") ;
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=row-i+1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
