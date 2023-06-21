import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int row = in.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*(row-i);k++)
            {
                System.out.print("  ");

            }
            for(int m = i;m>=1;m--)
            {
                System.out.print(m+" ");

            }
            System.out.println();
        }

    }
}
