import java.util.*;
public class sumOfRoundNumbers {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- >0) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int k = 1;
        int d = 0;
        while(n>0) {
            int r = n%10;
            if(r != 0) {
                sb.append((int)(r*k)+" ");
                d=0;
            }

            n/=10;
            k*=10;
        }
        String ans[] = sb.toString().split(" ");
      
            System.out.println(ans.length);
            System.out.println(sb);

    }

}
}