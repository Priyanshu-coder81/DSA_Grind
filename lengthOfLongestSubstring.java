// LEETCODE -> 3
class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int n = s.length();
        int right = 0;
        int left = 0;
        int max = 0;
       
       while(right < n) {

        if(!hset.contains(s.charAt(right))) {
            hset.add(s.charAt(right));
            right++;
            max = Math.max(max,right-left);
        }
        else {
            hset.remove(s.charAt(left));
            left++;
        }
       }

       return max;
    }
}