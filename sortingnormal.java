import java.util.*;
public class sortingnormal {
    static void main() {
        int arr[]={3,5,87,2,4,6,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
