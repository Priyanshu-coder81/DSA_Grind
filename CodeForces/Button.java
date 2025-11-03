import java.util.*;
public class Button {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); 
    long ans = 0;
    for(int i = 1; i<=t-1; i++){
        ans += i*(t-i);
    }
    ans+=t;
    System.out.println(ans);
}
}