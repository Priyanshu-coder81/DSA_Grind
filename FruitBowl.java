import java.util.*;

class FruitBowl {
    public static double dist(int[] p1 , int[] p2) {
        return Math.hypot(p1[0]-p2[0], p1[1]-p2[1]);
    }

    public static long cross(int[] o , int[] a , int[] b) {
        return (long)(a[0]-o[0])*(b[1]-o[1]) - (long)(a[1]-o[1])*(b[0]-o[0]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int point[][] = new int[n][2];

        for(int i = 0; i<n; i++) {
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }

        Arrays.sort(point,(a,b) -> a[0]==b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        
        for(int[] p : point) {
            while(result.size() >= 2 && cross(result.get(result.size()-2), result.get(result.size()-1), p) <= 0) {
                result.remove(result.size()-1);
            }
            result.add(p);
        }

        
        double perim = 0;
        for(int i = 0; i < result.size()-1; i++) {
            perim += dist(result.get(i), result.get(i+1));
        }

        System.out.println(Math.round(perim));
    }
}
