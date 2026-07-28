public class adjacentdiffsum {
    public static void main(String[]args){ //circularsum of adjacent absolute difference
        int arr[]={1,4,5,3,2};
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum=sum+Math.abs(arr[i]-arr[i-1]);
        }
        sum=sum+Math.abs(arr[arr.length-1]-arr[0]);
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println(sum);
    }
}
