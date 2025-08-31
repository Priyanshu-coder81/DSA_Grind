import java.util.*;
public class BoyOrGirl {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int a[] = new int[26];

    for(char c : s.toCharArray()) {
        a[c-'a']++;
    }
    int cnt = 0;
    for(int num : a) {
        if(num != 0) cnt++;
    }
    if((cnt&1) == 1)
    System.out.println("IGNORE HIM!");
    else 
    System.out.println("CHAT WITH HER!");
}
}