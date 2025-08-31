import java.util.*;
public class NextRound {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int cnt = 0;
    int arr[] = new int[n];
    for(int i = 0; i<n; i++) {
       arr[i] = sc.nextInt();
    }
    int ele = arr[k-1];

    for(int a : arr) {
        if(a>0 && a>=ele) cnt++;
    }

    System.out.println(cnt);
}
}