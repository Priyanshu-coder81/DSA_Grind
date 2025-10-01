import java.util.*;
public class BoringApartments {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    
    while(t-->0) {
        String s = sc.nextLine();
        int a = s.charAt(0)-'0';
        int ans =0;
        ans= (a-1)*10;

        int n =s.length();

        ans += (n*(n+1))/2;

        System.out.println(ans);

    }

}
}