import java.util.*;

class TaskManager {
    
    private Map<Integer, Integer> taskToPriority;
    private Map<Integer, Integer> taskToUser;
    private PriorityQueue<int[]> pq;

    public TaskManager(List<List<Integer>> tasks) {
        taskToPriority = new HashMap<>();
        taskToUser = new HashMap<>();
        pq = new PriorityQueue<>((a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1]; 
            return b[0] - a[0]; 
        });

        for (List<Integer> t : tasks) {
            int userId = t.get(0), taskId = t.get(1), priority = t.get(2);
            taskToPriority.put(taskId, priority);
            taskToUser.put(taskId, userId);
            pq.offer(new int[]{taskId, priority});
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskToUser.put(taskId, userId);
        taskToPriority.put(taskId, priority);
        pq.offer(new int[]{taskId, priority});
    }

    public void edit(int taskId, int newPriority) {
        taskToPriority.put(taskId, newPriority);
        pq.offer(new int[]{taskId, newPriority}); 
    }

    public void rmv(int taskId) {
        taskToPriority.remove(taskId);
        taskToUser.remove(taskId);
        
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int taskId = top[0], priority = top[1];


            if (taskToPriority.containsKey(taskId) && taskToPriority.get(taskId) == priority) {
                int userId = taskToUser.get(taskId);
                taskToPriority.remove(taskId);
                taskToUser.remove(taskId);
                return userId;
            }
            
        }
        return -1; 
    }
}
