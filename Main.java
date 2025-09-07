import java.util.*;
public class Main {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int t = sc.nextInt();
   for(int a = 0; a<t; a++) {
    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i = 0; i<n; i++) {
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    boolean flag = false;
    int k = 1;
    for(int i = 0; i<n; i++) {
        int p = arr[i]-1;

        while(p>0) {
            if(arr[i] == arr[i+1]){
                System.out.print((k)+" ");
            }
            else {
                flag = true;
                break;
            }
            p--;
            i++;
        }
        if(flag){ System.out.println("-1");
            break;
        }

            k++;
    }

    }



}
}