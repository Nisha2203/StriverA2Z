import java.util.Scanner;

public class Reverse_right_angle_5_6_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int row = in.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// time complexity -> (n*(n+1))/2 or O(n^2)