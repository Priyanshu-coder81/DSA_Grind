import java.util.*;
public class StringTask {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for(char c : s.toCharArray()) {
         c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'|| c=='y') continue;
        sb.append("."+c);

    }
    System.out.println(sb);

}
}