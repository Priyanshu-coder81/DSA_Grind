import java.util.*;
public class Unconventional {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

   while(n-- >0) {
    int t = sc.nextInt();
    int arr[] = new int[t];
    for(int i= 0; i<t; i++) {
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int max = 0;
    for(int i = 0; i<t; i+=2) {
        max = Math.max(max,arr[i+1]-arr[i]);
    }
   System.out.println(max);
   }
  
}
}
