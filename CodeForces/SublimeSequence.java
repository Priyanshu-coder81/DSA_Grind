import java.util.*;
public class SublimeSequence {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++) {
        int x = sc.nextInt();
        int t = sc.nextInt();

        if(t%2 == 0) {
            arr[i] = 0;
        }
        else {
            arr[i] = x;
        }
    }
    for(int a : arr) {
        System.out.println(a);
    }

}
}