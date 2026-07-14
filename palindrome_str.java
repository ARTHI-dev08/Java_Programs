import java.util.Scanner;
class palindrome{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter word : ");
        String str=ob.next();
        int n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Its Palindrome");
        }
        else{
            System.out.println("Its not an Palindrome");

        }
    }
}