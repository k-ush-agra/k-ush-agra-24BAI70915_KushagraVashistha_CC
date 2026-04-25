import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int left = 0, currentSum = 0, maxBooks = 0;
        for (int right = 0; right < n; right++) {
            currentSum += a[right];
            while (currentSum > t) {
                currentSum -= a[left];
                left++;
            }
            maxBooks = Math.max(maxBooks, right - left + 1);
        }
        System.out.println(maxBooks);
        sc.close();
    }
}
