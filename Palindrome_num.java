import java.util.Scanner;
class palindromenum{
    public static void main(String [] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=ob.nextInt();
        int pal=n;
        int a;
        int rev=0;
        while(n!=0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if(pal==rev){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("its not an palindrome");
        }
    }
}