public class Solution {
    public int maximum69Number (int num) {
        
        int n = num;
        StringBuilder sb = new StringBuilder();

        while(n>0) {
            int r = n%10;
            sb.append(r);
            n=n/10;
        }

        n = sb.length();
        num=0;
        int k= 0;

        for(int i = n-1; i>=0; i--) {
           char c = sb.charAt(i);
            if(k==0 && c=='6') {
            num=num*10 + 9;
            k++;
            continue;
           }
           num=(num*10)+(c-'0');
        }
        return num;
    }
} Maximum69numbers {
    
}




