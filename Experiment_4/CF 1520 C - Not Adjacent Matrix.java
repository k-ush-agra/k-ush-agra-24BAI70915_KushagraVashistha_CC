import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 2) {
                System.out.println("-1");
                continue;
            }
            if (n == 1) {
                System.out.println("1");
                continue;
            }
            int[] result = new int[n * n];
            int index = 0;
            for (int i = 1; i <= n * n; i += 2) {
                result[index++] = i;
            }
            for (int i = 2; i <= n * n; i += 2) {
                result[index++] = i;
            }
            for (int i = 0; i < n * n; i++) {
                System.out.print(result[i] + ( (i + 1) % n == 0 ? "\n" : " " ));
            }
        }
    }
}
