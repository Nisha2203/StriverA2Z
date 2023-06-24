import java.util.Scanner;

public class PrintReverseNumbers2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number ");
        int n = in.nextInt();
        print(n);
    }

     static void print(int n) {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
