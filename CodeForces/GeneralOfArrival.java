import java.util.*;
public class GeneralOfArrival {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++) {
        arr[i]= sc.nextInt();
    }
    int min = 0 , max = 0;
    for(int i = 1; i<n; i++) {
        if(arr[min] >= arr[i]) min = i;
        if(arr[max] < arr[i] )  max = i;
    }
    
    int ans = 0;
    if(max <min) {
        ans+=max;
    }
    else {
        ans+=max-1;
    }
    ans += (n-1-min);
    System.out.println(ans);
}
}