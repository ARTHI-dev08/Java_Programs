import java.util.Scanner;

class switchcase{
    public static void main(String[] args){
        System.out.println("Operations : + \n - \n * \n /");
        int a;
        int b;
        int sum;
        char c;
        System.out.println("Enter your OPerations");
        Scanner sym=new Scanner(System.in);
        System.out.println("Enter a");

        a=sym.nextInt();
        System.out.println("Enter b");

        b=sym.nextInt();
        System.out.println("Enter your OPerations");

        c=sym.next().charAt(0);
        switch(c){
            case '+':
                sum=a+b;
                System.out.println(sum);
                break;
            case '-':
                sum=a-b;
                System.out.println(sum);
                break;
            case '*':
                sum=a*b;
                System.out.println(sum);
                break;
            case '/':
                sum=a/b;
                System.out.println(sum);
                break;
            default:
                System.out.println("Enter valid OPerations");
        }


    }
}