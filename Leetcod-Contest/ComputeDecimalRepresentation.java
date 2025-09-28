class Solution {
    public int[] decimalRepresentation(int n) {
        String s = new String(n+"");
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c != '0') cnt++;
        }
        n =s.length();
        int a[] = new int[cnt];
        int k = 0;
        int p = n-1;
        
        for(int i = 0; i<n; i++) {
            int t = s.charAt(i)-'0';
            if(t != 0) {
                a[k++] = t*(int)(Math.pow(10,p));
            }
            p--;
        }
        return a;
    }
}