import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] u = new int[n - 1];
        int[] v = new int[n - 1];
        int[] degree = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            u[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
            degree[u[i]]++;
            degree[v[i]]++;
        }
        int specialNode = -1;
        for (int i = 1; i <= n; i++) {
            if (degree[i] >= 3) {
                specialNode = i;
                break;
            }
        }
        int[] labels = new int[n - 1];
        Arrays.fill(labels, -1);
        if (specialNode == -1) {
            for (int i = 0; i < n - 1; i++) {
                System.out.println(i);
            }
            return;
        }
        int label = 0;
        int specialEdgesFound = 0;
        for (int i = 0; i < n - 1; i++) {
            if (specialEdgesFound < 3 && (u[i] == specialNode || v[i] == specialNode)) {
                labels[i] = specialEdgesFound++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (labels[i] == -1) {
                labels[i] = specialEdgesFound++;
            }
            System.out.println(labels[i]);
        }
    }
}
