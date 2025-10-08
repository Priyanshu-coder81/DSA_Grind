class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;

        int ans[] = new int[n];
        int temp[] = Arrays.copyOf(spells,n);

        Arrays.sort(temp);
        Arrays.sort(potions);

        HashMap<Integer,Integer> hmap = new HashMap<>();

        int j = m-1;
       for(int i = 0; i<n; i++) {

        while(j>=0 && ((long)temp[i]*potions[j]) >= success) {
            j--;
        }
        hmap.put(temp[i],m-j-1);
       }

       for(int i = 0; i<n; i++) {
        ans[i] = hmap.get(spells[i]);
       }
       return ans;
    }
}