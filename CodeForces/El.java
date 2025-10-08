/* 
 import java.util.*;
 public class NumberOnWhiteBoard {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
sc.nextLine();
     while(t-->0) {
 int n = sc.nextInt();

            int res = n; 
            List<int[]> ops = new ArrayList<>();

            for (int i = n - 1; i >= 1; i--) {
                ops.add(new int[]{res, i});
                res = (res + i + 1) / 2; 
            }

            System.out.println(res); 

            for (int[] op : ops) {
                System.out.println(op[0] + " " + op[1]);
            }
     }
 
 }
 } */

        import java.util.*;
        public class El {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        sc.nextLine();
            while(n-->0){
                int t = sc.nextInt();
                if(t==2){ System.out.println(t); return;}
                else if(t==3) {System.out.println(4);
                return;}
                System.out.println(2*t-2);
            }

            }

        }