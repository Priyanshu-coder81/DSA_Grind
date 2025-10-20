class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;

        for(String word : operations) {
            if(word.equals("--X") || word.equals("X--")) ans--;
            else ans++;
        }
        return ans;
    }
}