class Solution {
    public int minOperations(String s) {
        int min = 26;
        for(char c : s.toCharArray()) {
            if(c!= 'a') {
                min = Math.min(c-'a',min);
            }
        }

        
        return 26-min;
    }
}