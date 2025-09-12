class Solution {
    public String sortVowels(String s) {
        int n = s.length();

        ArrayList<Integer> arr = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                int asc = c;
                arr.add(asc);
            }
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(char c : s.toCharArray()) {
             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                sb.append((char)(int)arr.get(j));
                j++;
            }
            else {
            sb.append(c);}
        }
        return sb.toString();
    }
}