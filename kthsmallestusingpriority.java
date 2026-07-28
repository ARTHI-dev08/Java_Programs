import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class kthsmallestusingpriority {
    public static void main(String[]args){
        int arr[]={2,4,5,3,2,5,1,7};
        int k=3;
        Set<Integer> set=new LinkedHashSet<>();
        for(int n:arr){
            set.add(n);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int n:set){
            pq.add(n);
            while(pq.size()>k){
                pq.poll();
            }
        }
            System.out.println(pq.poll());

    }
}
