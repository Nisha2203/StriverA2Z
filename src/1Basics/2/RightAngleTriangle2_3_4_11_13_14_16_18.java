import java.util.Scanner;

public class RightAngleTriangle2_3_4_11_13_14_16_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int row = in.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
// time complexity -> (n*(n+1))/2 or O(n^2)