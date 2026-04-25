import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] a = new int[n];
        int initialOnes = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                initialOnes++;
            }
        }
        int maxGain = -1; 
        int currentGain = 0;
        for (int i = 0; i < n; i++) {
            int val = (a[i] == 0) ? 1 : -1;
            currentGain += val;
            if (currentGain > maxGain) {
                maxGain = currentGain;
            }
            if (currentGain < 0) {
                currentGain = 0;
            }
        }
        System.out.println(initialOnes + maxGain);
        sc.close();
    }
}
