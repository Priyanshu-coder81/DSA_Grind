import java.util.*;
public class HelpfulMath {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int a = 0 , b = 0 , c = 0;
    int n = s.length();
    for(int i = 0; i<n; i+=2) {
        char ch = s.charAt(i);
        if(ch == '1') a++;
        else if(ch == '2') b++;
        else c++;
    }

    StringBuilder sb = new StringBuilder();

       while(a-- > 0) {
        sb.append("1+");
       }
       while(b-- > 0) sb.append("2+");

       while(c-- > 0) sb.append("3+");
      
       System.out.println(sb.substring(0,n));

}
}