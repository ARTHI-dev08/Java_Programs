import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;

public class mappract {
    public static void main(String[]args){
        char str[]="engineering".toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:str){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            pq.offer(e);
        }
        String res="";
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> op=pq.poll();
            for(int i=0;i<op.getValue();i++){
                res=res+op.getKey();
            }
        }
        System.out.println(res);
    }
}
