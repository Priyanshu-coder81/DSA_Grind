import java.util.*;
public class Word {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1));

}
}