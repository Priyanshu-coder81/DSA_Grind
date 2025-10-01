import java.util.*;
public class Gennady {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    String st = sc.nextLine();

    if(st.indexOf(s.charAt(0)) != -1) 
        System.out.println("YES");
    else if(st.indexOf(s.charAt(1)) != -1) 
        System.out.println("YES");
    else 
    System.out.println("NO");
}

}