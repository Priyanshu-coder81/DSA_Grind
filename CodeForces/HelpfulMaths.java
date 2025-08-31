import java.util.*;
public class HelpfulMaths {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int arr[] = new int[4];

    for(int i = 0; i<s.length(); i+=2) {
        char c = s.charAt(i);
        arr[c-'0']++;
    }

    StringBuilder sb = new StringBuilder();

    for(int i = 1; i<4; i++) {
        int t = arr[i];
        while(t>0) {
            sb.append(i+"+");
            t--;
        }
    }
    sb.deleteCharAt(sb.length()-1);

    System.out.println(sb);

}
}