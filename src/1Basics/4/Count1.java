import java.util.Scanner;

public class Count1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
        int k=n;
        int count = 0;
        while(k>0)
        {
            int r = k%10;
            if(r!=0 && n%r==0)
            {
                count++;
            }
            k/=10;
        }
        System.out.println(count);

        //to count no of digits directly
        //1 method time complexity O(log(n))
        int a =0;
        while(n>0)
        {
            a++;
            n/=10;
        }
        System.out.println(a);

        //2 method time complexity O(1)
        //System.out.println((int)(Math.log10(n))+1);
    }
}
