import java.util.*;
public class AntonandPolyhedrons {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    int ans = 0;
    while(t-- > 0) {
        String s = sc.nextLine();
        if(s.equals("Icosahedron")) {
            ans+=20;
        }
        else if (s.equals("Dodecahedron")) ans += 12;
        else if(s.equals("Octahedron")) ans+=8;
        else if(s.equals("Cube")) ans += 6;
        else ans+=4;
    }
    System.out.println(ans);

}
}