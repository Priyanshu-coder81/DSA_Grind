class Packet {
    int source;
    int destination;
    int timestamp;
    Packet(int source, int destination, int timestamp) {
        this.source = source;
        this.destination = destination;
        this.timestamp = timestamp;
    }
}
class Router {
    // destination packet
    HashMap<Integer,ArrayList<Integer>> hmap;
    Queue<Packet> q;
    HashSet<Long> dupKey;
    int memory;

    public Router(int memoryLimit) {
        this.memory = memoryLimit;
        this.dupKey = new HashSet<>();
        this.hmap =   new HashMap<>();
        this.q = new LinkedList<>();
    }
    private long makeKey(int s, int d, int t) {
        return (long)s * 10000000000L + (long)d * 100000 + t; 
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        long key = makeKey(source,destination,timestamp);
        if(dupKey.contains(key)) return false;

        if(q.size() == memory) {
            Packet old = q.poll();
            long oldKey = makeKey(old.source, old.destination, old.timestamp);
            dupKey.remove(oldKey);

            ArrayList<Integer> list = hmap.get(old.destination);
            list.remove(0);
            if(list.isEmpty()) hmap.remove(old.destination);
        }

        Packet p  = new Packet(source,destination, timestamp);
        q.add(p);
        dupKey.add(key);
        hmap.putIfAbsent(destination, new ArrayList<>());
        hmap.get(destination).add(timestamp);
        return true;
    }

    // FIFO
    public int[] forwardPacket() {
        if(q.isEmpty()) return new int[0];
        Packet p = q.poll();

        long key = makeKey(p.source,p.destination,p.timestamp);
        dupKey.remove(key);

        ArrayList<Integer> list = hmap.get(p.destination);
        list.remove(0);

        if(list.isEmpty()) hmap.remove(p.destination);

        return new int[]{p.source,p.destination,p.timestamp};
    }
    
    public int getCount(int destination, int startTime, int endTime) {
         if (!hmap.containsKey(destination)) return 0;
        ArrayList<Integer> list = hmap.get(destination);
        // Binary search since timestamps are increasing
        int left = lowerBound(list, startTime);
        int right = upperBound(list, endTime);
        return right - left;
    }
     private int lowerBound(ArrayList<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) >= target) r = m;
            else l = m + 1;
        }
        return l;
    }

    // Helper: upper_bound
    private int upperBound(ArrayList<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) > target) r = m;
            else l = m + 1;
        }
        return l;
    }
}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */