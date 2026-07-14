import java.util.Scanner;
class revstr{
    public static void main(String[]args){
        String str;
        int n;
        Scanner ob=new Scanner(System.in);
        str=ob.next();
        n=str.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}