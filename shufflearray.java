import java.util.Arrays;

public class shufflearray {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8};
        int count=0;
        int copy[]=arr;

        do{
        copy=shuffle(copy);
        count++;

        }while(!Arrays.equals(arr,copy));

        System.out.println(count);
    }

    public static int [] shuffle(int []arr) {
        int mid = arr.length / 2;
        int newarray[] = new int[arr.length];
        int ind=0;
        for (int i = 0; i < mid; i++) {
            newarray[ind++] = arr[mid+i];
            newarray[ind++] = arr[i];
        }
        return newarray;

    }
}
