import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int leadingOnes = 0;
            while (leadingOnes < n && a[leadingOnes] == 1) {
                leadingOnes++;
            }
            if (leadingOnes == n) {
                if (n % 2 == 1) System.out.println("First");
                else System.out.println("Second");
            } else {
                if (leadingOnes % 2 == 0) System.out.println("First");
                else System.out.println("Second");
            }
        }
    }
}
