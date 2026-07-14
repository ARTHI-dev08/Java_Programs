import java.util.Scanner;
class tables{
    public static void main(String[] args){
        int n;
        int c;
        int i;
        Scanner tab=new Scanner(System.in);
        System.out.print("Enter number:");
        n=tab.nextInt();
        for(i=1;i<=10;i++){
            c=i*n;
            System.out.println(i+"*"+n+"="+c);
        }
    }
}