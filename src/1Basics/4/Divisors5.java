import java.util.Scanner;

public class Divisors5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }


// Given a positive integer N., The task is to find the value of    \sum_{i=1}^{i=n} F(i)  where function F(i) for the number i be defined as the sum of all divisors of ‘i‘.
        // code here
        long ans=0;
        for(int i=1;i<=n;i++ )
        {

            ans+= (n/i)*i;
        }
        System.out.println(ans);

    }
}
