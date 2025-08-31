import java.util.*;
public class StonesOnTheTable {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    String s = sc.nextLine();
    
    int cnt = 0;

    for(int i = 1; i<n; i++) {
        if(s.charAt(i) == s.charAt(i-1)) {cnt++;}
    }
System.out.println(cnt);

}
}