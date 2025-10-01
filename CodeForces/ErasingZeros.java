import java.util.*;
public class ErasingZeros {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    while(n-- > 0) {
        String s = sc.nextLine();
        int t = s.length();
        int i = 0; int j = t-1;
        int cnt = 0;

        while(i<n && s.charAt(i) != '1') i++;
        while(j>=0 && s.charAt(j) != '1') j++;

        if(i>=n || j< 0) {
            System.out.println(0);
            return;
        }

        while(i<=j) {
            if(s.charAt(i++) != '1') cnt++;
        }
        System.out.println(cnt);
        
    }
}
}