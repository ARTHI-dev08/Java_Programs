import java.util.*;
public class map {
    public static void main(String[]args){
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        System.out.println(map.containsValue("b"));
        for(Integer k: map.keySet()){
            System.out.println(k+":"+map.get(k));
        }
    }
}
