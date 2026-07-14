import java.util.Scanner;
class factorial{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int num;
        int fact;
        System.out.print("Enter number : ");
        num=n.nextInt();
        fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}