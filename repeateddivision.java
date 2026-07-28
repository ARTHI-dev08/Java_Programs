public class repeateddivision {
    public static void main(String[]args){
        int n=6;
        int sum=0;
        for(int i=2;i<=n;i++){
            int c=count(i);
            sum=sum+c;
        }
        System.out.println(sum);
    }
    public static int count(int i){
        int c=0;
        while(i!=1){
            c++;
            i=i/2;
        }
        return c;
    }
}

