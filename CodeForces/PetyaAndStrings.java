import java.util.*;
public class PetyaAndStrings {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();

    a = a.toLowerCase();
    b = b.toLowerCase();
    int t = 0;
    for(int i = 0; i<a.length(); i++) {
        if(a.charAt(i) > b.charAt(i)) {
            t = 1;
            break;
        }
        if(a.charAt(i) < b.charAt(i)) {
            t=-1;
            break;
        }
    }

    System.out.println(t);

}
}