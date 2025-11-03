/* import java.util.*;
public class ramp {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    while(n-- > 0){
        int arr[]= new int[4];
        
        
        for(int i = 0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for(int i=0; i<4; i++){
            if(arr[i] != arr[0]) {
                flag = false;
                break;
                }
        }
        if(flag)
        System.out.println("YES");
        else
        System.out.println("NO");
        
    }

}
} */



/* 
import java.util.*;
public class yourName {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int ti = sc.nextInt();
    while(ti-- > 0){
         int n = sc.nextInt(); 
            String s = sc.next();
            String t = sc.next();

            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();
            
            Arrays.sort(sArr);
            Arrays.sort(tArr);

            if (Arrays.equals(sArr, tArr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
    }

}
} */
/* 
import java.util.*;
public class ramp {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t-- > 0){

        int n = sc.nextInt();
        int arr[]  = new int[n];

        for(int  i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int odd = 0 , even = 0;

        for(int i : arr){
            if((i&1) == 1) odd++;
            else even++;
        }

        if(odd != 0 && even !=0){
           Arrays.sort(arr);
        }

        for(int i : arr){
                System.out.print(i+" ");
            }
            System.out.println();
    }

}
} */

import java.util.*;
public class ramp {
      static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67,
            71, 73, 79, 83, 89, 97, 101, 103, 107,
            109, 113, 127, 131, 137, 139, 149, 151
        };

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long g = a[0];
            for (int i = 1; i < n; i++) {
                g = gcd(g, a[i]);
                if (g == 1) break; }

            if (g == 1) {
                System.out.println(2);
                continue;
            }

            long ans = -1;
            for (long p : primes) {
                if (g % p != 0) {
                    ans = p;
                    break;
                }
            }

            System.out.println(ans);
        }

}
}