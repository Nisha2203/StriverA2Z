import java.util.Scanner;

public class ReverseTriangle_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int row = in.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*(row-i)+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
