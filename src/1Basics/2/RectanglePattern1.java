import java.util.Scanner;

public class RectanglePattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int row = in.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//time complexity -> O(N^2)q

