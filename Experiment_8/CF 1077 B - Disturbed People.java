import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (a[i] == 0 && a[i - 1] == 1 && a[i + 1] == 1) {
                count++;
                a[i + 1] = 0; 
            }
        }
        System.out.println(count);
    }
}
