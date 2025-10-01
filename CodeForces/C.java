import java.util.*;
public class C {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    while(n-- > 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int cnt = 0;

       while(a<=c && b<=c) {
        if(a<=b) {
            a+=b;
        }
        else {
            b+=a;
        }
        cnt++;
       }
        System.out.println(cnt);
    }

}
}