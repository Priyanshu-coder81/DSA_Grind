import java.util.*;
public class Bit {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int cnt = 0;
    for(int i =0; i<n; i++) {
        String word = sc.nextLine();
        if(word.equals("X++") || word.equals("++X")) cnt++;
        if(word.equals("X--") || word.equals("--X")) cnt--;

    } 
    System.out.println(cnt);

}
}