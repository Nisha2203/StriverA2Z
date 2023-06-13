import java.util.Scanner;

public class Ifelse3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1>num2)
        {
            System.out.println("num1 is greater ");
        }
        else if(num1==num2)
        {
            System.out.println("num1 and num2 are equal ");
        }
        else
        {
            System.out.println("num1 is lesser ");
        }
    }
}
