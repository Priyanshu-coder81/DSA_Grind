import java.util.*;
public class Chewbacca {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   StringBuilder sb  = new StringBuilder();
int n = s.length();
   for(int i = 0; i<n; i++) {
    int digit = s.charAt(i)-'0';
    int invert = 9-digit;

    if(i == 0 && invert == 0) {
        sb.append(digit);
    }
    else sb.append((digit<invert)?digit:invert);
   }

   System.out.println(sb);

}
}