import java.util.Scanner;
class even_or_odd{
    public static void main(String [] args){
        int n;
        Scanner num=new Scanner(System.in);
        System.out.print("Enter NUmber : ");
        n=num.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}