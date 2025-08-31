import java.util.*;
public class WordCapitalization {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    
    char c = Character.toUpperCase(s.charAt(0));

    System.out.println(c+s.substring(1));

}
}