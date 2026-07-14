import java.util.*;
public class watercapacity {
    public static void main(String[]args){
        int arr[]={1,4,7,9,4,5,6,8,6,3,2};
        int max=0;
        int l=0;
        int p1=0;
        int p2=0;
        int r=arr.length-1;
        while(l<r){
            int width=Math.min(arr[l],arr[r]);
            int area=width*(arr[l]-arr[r]);
            if(area>max){
                max=area;
                p1=arr[l];
                p2=arr[r];

            }

            if(arr[l]<arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println("maximum area covered "+max +"with values of "+p1+" "+p2);
    }
}
