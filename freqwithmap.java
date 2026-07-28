import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class freqwithmap {
    public static void main(String[]args){
        String str="engineering";
        Map<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);


            map.put(c,map.getOrDefault(c,0)+1); //replace for contains,




        }
        int max=1;
        char ch=' ';
        String Fin="";
        for(char c:map.keySet()){ //iterating key
            if(map.get(c)>max){
                max=map.get(c);
                ch=c;
            }
            else if(map.get(c)==max){
               Fin=ch+" "+c;
            }
        }
        System.out.println(Fin);

    }
}
