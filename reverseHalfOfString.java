public class reverseHalfOfString {
    public static void main(String[]args){
        String str="hello";
        int size=str.length();
        int n=size/2;
        char c[]=str.toCharArray();
        int i=0;
        int j=n-1;
        while(i<j){
            char tem=c[i];
            c[i]=c[j];
            c[j]=tem;
            i++;
            j--;

        }
        System.out.println(new String(c));

    }
}
