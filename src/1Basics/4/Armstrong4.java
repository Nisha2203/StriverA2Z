import java.util.Scanner;

public class Armstrong4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
        int ans=0,k=n;
        while(n>0)
        {
            int r = n%10;
            ans+= r*r*r;

        }
    }
}
