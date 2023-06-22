import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        // reverse a digit
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
//        int rev=0;
//        while(n>0)
//        {
//            rev=rev*10+n%10;
//            n/=10;
//        }
//        System.out.println(rev);



        //Given a 32 bit number X, reverse its binary form and print the answer in decimal.
        Long rev = 0l;
        int count = 32;
        while(count>0)
        {
            rev=rev*2+(n&1);
            n=n>>1;
            count=count-1;
        }
        System.out.println(rev);




    }
}
