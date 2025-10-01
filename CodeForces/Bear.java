import java.util.*;
public class Bear {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int cnt = 0;
    while(n<=m) {
        n*=3;
        m*=2;
        cnt++;
    }

    System.out.println(cnt);

}
}