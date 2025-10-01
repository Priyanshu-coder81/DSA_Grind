import java.util.*;
public class SoldierandBananas {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();
    int a = 0;
    while(w > 0) {
        a += w*k;
        w--;
    }

    if(a-n > 0) 
    System.out.println(a-n);
    else 
    System.out.println(0); 

}
}