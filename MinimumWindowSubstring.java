class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        
        if (len1 < len2) return "";

        int l = 0 , r= 0;

        HashMap<Character,Integer> hmap = new HashMap<>();

        // Storing characters freq of t
        for(char c : t.toCharArray()) {
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }

        int cnt  = 0;
        int start = -1;
        int end = -1;
        int maxlen = Integer.MAX_VALUE;

        while(l< len1 && r < len1) {
            char c = s.charAt(r);

           if(hmap.containsKey(c) && hmap.get(c)>0) {
            cnt++;
           }
           hmap.put(c,hmap.getOrDefault(c,0)-1);

            while(cnt == len2) {
                if(maxlen>(r-l+1)) {
                    maxlen = r-l+1;
                    start = l;
                    end = r;
                }
        
                char left = s.charAt(l);

                hmap.put(left,hmap.get(left)+1);
                if(hmap.get(left) > 0)
                     cnt--;
                l++;
            }
            r++;
        }
        if(start == -1) return "";
        
        return s.substring(start,end+1);

    }
}