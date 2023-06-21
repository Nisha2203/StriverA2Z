import java.util.Scanner;

public class Triangle_7_17 {
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
            for(int k=1;k<2*i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        int a = 64;
        for(int i=1;i<=row;i++)
        {
            for(int j =i;j<row;j++)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++)
            {
                System.out.print((char)(a+k));
            }
            for(int l=1;l<i;l++)
            {
                System.out.print((char)(a+i-l));
            }
            System.out.println();

        }
    }
}
