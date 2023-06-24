import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();

        //1-> loops
        int ans=0;
        if(n==1)
        {
            ans=0;
        }
        if(n==2)
        {
            ans=1;
        }
        int num1=0, num2=1;
        for(int i=1;i<n-1;i++)
        {
            ans=num1+num2;
            num1=num2;
            num2=ans;
        }
        System.out.println(ans);


        // 2. recursive
        System.out.println(fibo(n));

        //3. formula
        System.out.println(fib(n));
    }
    static int   fibo(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }



    //3. formula
    static int fib(int n)
    {
        int ans = (int) (((Math.pow(n,(1+Math.sqrt(5))/2))-(Math.pow(n,(1-Math.sqrt(5))/2)))/Math.sqrt(5));
        return ans;
    }
}
