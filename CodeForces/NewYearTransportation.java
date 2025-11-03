import java.util.*;
public class NewYearTransportation {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int arr[] = new int[n-1];
    for(int i =0; i<n-1; i++){
        arr[i] = sc.nextInt();
    }
    int ans = 1;
    
  int pos = 1; // we start at cell 1 (1-indexed)
        while (pos < t) {
            pos += arr[pos - 1];
        }

        if (pos == t) System.out.println("YES");
        else System.out.println("NO");

}
}