import java.util.*;
public class BePositive {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans[] = new int[n];
    for(int i = 0; i<n; i++) {
        int t = sc.nextInt();
        int arr[] = new int[t];
        int neg = 0;
        int cnt = 0;
        for(int j = 0; j<t; j++) {
            arr[j] = sc.nextInt();
            if(arr[j] == -1) neg++;
            else if(arr[j] == 0) cnt++;

        }
        
        if((neg&1) == 1) {
            cnt+=2;
        }
        ans[i] = cnt;

       

    }

    for(int i = 0; i<n; i++) {
         System.out.println(ans[i]);
    }
    

}
}