class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String ans = "";
        int k = 0;

        for(int i = 0; i<n-2; i++) {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {          
                int t = num.charAt(i) - '0';

                if(k<=t) {
               ans = num.substring(i,i+3);
               k = t;
               }
            }
        }
        return ans;
    }
}