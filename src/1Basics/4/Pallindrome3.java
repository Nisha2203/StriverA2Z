import java.util.Scanner;

public class Pallindrome3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
        int rev=0,k=n;
        while(k>0)
        {
            rev=rev*10+k%10;
            k/=10;
        }
        if(rev==n)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("non -pallindrome ");
        }

    }
}
