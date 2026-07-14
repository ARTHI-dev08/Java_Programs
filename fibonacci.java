import java.util.Scanner;
class fibo{
    public static void main(String[]args){
        int a=0;
        int b=1;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n=ob.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }

    }
}