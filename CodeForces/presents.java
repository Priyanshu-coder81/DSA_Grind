import java.util.*;
public class presents {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int ans[] = new int[n];
    for(int i = 0; i<n; i++) {
        ans[sc.nextInt()-1] = i+1;
    }

    for(int i : ans) {
        System.out.print(i+" ");
    }

}
}