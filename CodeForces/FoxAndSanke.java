
import java.util.*;
public class FoxAndSanke {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int flag = 1;
    for(int i  =0; i<n; i++) {
        if((i&1) == 0) {
            for(int j = 0;j<m; j++) {
                System.out.print("#");
            }
        }
        else {
            for(int j = 0;j<m; j++) {
                if(flag==1 && j == m-1)
                System.out.print("#");
                else if(flag == 0 && j == 0) 
                System.out.print("#");
                else 
                System.out.print(".");
            }
            flag = flag^1;
        }
        System.out.println();
    }

}
}