import java.util.*;
public class RepeatingCipher {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    int a = 1;

    String s = sc.nextLine();

    int i = 0;
    StringBuilder sb = new StringBuilder();

    while(i<n) {
        sb.append(s.charAt(i));
        i+=a;
        a++;
    }
    System.out.println(sb);

}
}