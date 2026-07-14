import java.util.*;
public class frequency {
    public static void main(String[]args){
        String str="programming";
        int n=str.length();
        int count=0;
        Map<Character , Integer> map=new LinkedHashMap<>();//linked for precising order
        for(int i=0;i<n;i++){
           char ch=str.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }
           else{
               map.put(ch,1);
           }
        }
        for(Character c:map.keySet()) {
            System.out.println(c + ":" + map.get(c));

        }
    }

}
