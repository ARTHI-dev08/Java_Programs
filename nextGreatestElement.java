public class nextGreatestElement {
    public static void main(String[]args){
        int arr[]={1,4,3,5,2};
        int finarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            boolean a=true;
            while(j<arr.length){
                a=true;
                if(arr[j]>arr[i]){
                    a=false;
                    finarr[i]=arr[j];
                    break;
                }
                j++;
            }
            if(a){
                finarr[i]=-1;
            }
        }
        for(int n:finarr){
            System.out.print(n+" ");
        }
    }
}
