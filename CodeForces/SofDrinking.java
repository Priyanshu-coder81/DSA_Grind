import java.util.*;
public class SofDrinking {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int l = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int p = sc.nextInt();
    int nl = sc.nextInt();
    int np = sc.nextInt();

    int a = (k*l)/(nl);
    int b = (c*d);
    int t = p/np;

    int res = Math.min(a,Math.min(b,t));
    System.out.println(res/n);

}
}