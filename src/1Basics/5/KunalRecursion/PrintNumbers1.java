//print n numbers
import java.util.Scanner;

public class PrintNumbers1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
        print(n);

        //using loops
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
    static void print(int n)
    {
        if(n==0)
        {
            return;
        }
       print(n-1);
        System.out.println(n);
    }
}
