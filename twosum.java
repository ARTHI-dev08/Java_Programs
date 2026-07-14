import java.util.*;
public class twosum {
    public static void main(String[]args){
        int arr[]={2,55,6,7,8};

        Arrays.sort(arr);
        int  target=8;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
        if(sum==target){
            System.out.println("found with sum of"+" "+arr[l]+"and "+arr[r]);
            return;
        }
        else if(sum>target){
            r--;
        }
        else{
            l++;
        }
        }
    }
}
