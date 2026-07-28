import java.util.Arrays;

public class smallestmissing {
    public static void main(String[] args){
        int arr[]={-1,0,1,2,3,6,7};
//        for(int i=0;i<arr.length;i++){ this works but smal,est positive sequence is given
//            if(arr[i]<=0){
//                continue;
//            }
//            if(arr[i]+1==arr[i+1]){
//                continue;
//            }
//            else{
//                System.out.println(arr[i]+1);
//                break;
//            }
//        }
        Arrays.sort(arr);
        int st=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                continue;
            }
            else if(arr[i]==st){
                st++;
            }
            else{
                System.out.println(st);
                break;
            }
        }
    }
}
