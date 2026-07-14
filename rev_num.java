import java.util.Scanner;
class revnum{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int n;
        n=num.nextInt();
        int a=0;
        //n%10== last num
        //a=a*10+lastnum
        //num/10==omiting last num
        while(n!=0){
            int last=n%10;
            a=a*10+last;
            n=n/10;

        }
        System.out.println(a);
    }
}