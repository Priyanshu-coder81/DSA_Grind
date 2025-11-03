import java.util.*;
public class Staris {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    if(n<m){
        System.out.println(-1);
        return;
    }

    int min = (n+1)/2;

    while(min <= n){
        if(min%m == 0){
            System.out.println(min);
            return;
        }
        min++;
    }

    System.out.println(-1);
}
}