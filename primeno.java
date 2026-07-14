import java.util.Scanner;
class prime{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=ob.nextInt();
        if(n<=1){
            System.out.println(n+" is not an prime number");
        }
        else{
            boolean ist=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    ist=false;
                    break;
                    // if here System.out.println(n+" is not an prime number"); means print n times
                }
            }
            if(ist){
                System.out.println(n+" is an prime number");
            }
            else{
                System.out.println(n+" is not an prime number");

            }
        }
    }
}