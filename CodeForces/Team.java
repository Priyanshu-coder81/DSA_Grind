import java.util.*;
public class Team {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;
    for(int i = 0; i<n; i++) {
        cnt += ((sc.nextInt() + sc.nextInt() + sc.nextInt())>1)? 1:0 ;
    }
    System.out.println(cnt);
}
}