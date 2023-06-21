import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows ");
        int n = in.nextInt();
        int k, l;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (i <= n) {
                    k = n - i + 1;
                } else {
                    k = i - n + 1;
                }
                if (j <= n) {
                    l = n - j + 1;
                } else {
                    l = j - n + 1;
                }
                System.out.print(Math.max(k, l) + " ");
            }
            System.out.println();
        }
    }
}
