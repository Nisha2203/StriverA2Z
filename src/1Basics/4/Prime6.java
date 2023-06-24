import java.util.Scanner;

public class Prime6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
        int flag=0;
        if(n<=1)
        {
            System.out.println("false");
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                System.out.println("false");
                break;
            }
        }
        if(flag ==0)
        {
            System.out.println("true");

        }
    }
}
