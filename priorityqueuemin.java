import java.util.PriorityQueue;

public class priorityqueuemin {
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 1, 6, 8, 7, 5};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : arr) {
            pq.offer(n);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll());
        }
    }
}