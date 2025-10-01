import java.util.*;
public class Tram {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int ans = 0;
     int p = 0;
    while(n-- > 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();

       
        p-=a;
        p+=b;

        ans = Math.max(ans,p);

    }
    System.out.println(ans);

}
}