import java.util.*;
public class TheaterSquare {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long m= sc.nextInt();
    long a = sc.nextInt();

    long p = (n+a-1)/a;
   long q = (m+a-1)/a;

    System.out.println((long)p*q);

}
}