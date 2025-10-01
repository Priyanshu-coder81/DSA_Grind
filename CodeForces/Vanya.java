import java.util.*;
public class Vanya {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    while(n > 0) {
        n -= (a*(a+1))/2;
        if(n<0) break;
        a++;
    }
    System.out.println(a-1);
   
}
}