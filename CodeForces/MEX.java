import java.util.*;

public class MEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean[] present = new boolean[k];
            int countK = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val < k) present[val] = true;
                if (val == k) countK++;
            }

            int missingCount = 0;
            for (int i = 0; i < k; i++) {
                if (!present[i]) missingCount++;
            }

            int operations = Math.max(missingCount, countK);
            System.out.println(operations);
        }
    }
}
