import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int row = in.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                if(j==1||j==row||i==1||i==row)
                {
                    System.out.print("*");
                }
                else

                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
