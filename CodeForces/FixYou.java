import java.util.*;
public class FixYou {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();

    while(t-- > 0) {
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine();

    
    int cnt = 0;
    for(int i = 0; i<n; i++) {
       String s = sc.nextLine();
        if(s.charAt(m-1) == 'R') cnt++;

        if(i==n-1) {
            for(int j = 0; j<m; j++) {
                if(s.charAt(j) == 'D') cnt++;
            }
        }
    }
    System.out.println(cnt);
    }

}
}