class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        HashSet<Integer> hset = new HashSet<>();

        for(int frnd[] : friendships) {
            int u = frnd[0]-1;
            int v = frnd[1] - 1;

            HashSet<Integer> cont = new HashSet<>(Arrays.stream(languages[u]).boxed().toList());
            boolean flag = false;
            for(int i : languages[v]) {
                if(cont.contains(i)) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                hset.add(u);
                hset.add(v);
            }
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int max = 0;
        for(Integer num : hset) {
           int a[] = languages[num];

           for(int t : a) {
            hmap.put(t,hmap.getOrDefault(t,0)+1);
            max = Math.max(max,hmap.get(t));
           }
        }
    return hset.size()-max;

    }
}