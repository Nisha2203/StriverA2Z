import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter choice 1 or 2 ");
        // if choice =1 then area of circle else area of rectangle
        int choice = in.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("enter radius of circle ");
               double r = in.nextDouble();
                double a = Math.PI * r *r;
                System.out.println("area of cicle is "+a);
                break;

            default:
                System.out.println("enter length of rectangle ");
                int l =  in.nextInt();
                System.out.println("enter breadth of rectangle ");
                int b = in.nextInt();
                int area = l*b;
                System.out.println("area of rectangle is "+area);
        }

    }
}
