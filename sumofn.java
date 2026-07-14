import java.util.Scanner;
class sumofn{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=ob.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}