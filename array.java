public class array {
    public static void main(String[]args){
        int arr[]={1,3,5,6,3,7,9,6,4};
        int res=compar(arr);
        System.out.println(res);
    }
        public static int compar(int [] arr)
        {
            int n=arr.length;
            int coun=0;
            for(int i=1;i<n-1;i++){
                if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                    coun++;
                }
            }
            return coun;
        }
    }

