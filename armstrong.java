import java.util.Scanner;
class arm extends digits{
    public static int exp(int n,int dig){
        int base=n;
        int powe=dig;
        int a=1;
        for(int i=1;i<=powe;i++){
            a=a*base;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int total_sum=1;
        System.out.print("Enter num: ");

        int num = ob.nextInt();
        int temp = num;
        int sum = 0;
        int digitsc = countnum(num);
        while (temp != 0) {
            int b = temp % 10;
            int c = exp(b, digitsc);
            sum = sum + c;
            temp = temp / 10;

        }
        if(num==sum){
            System.out.println("Its Armstrong");
        }
        else{
            System.out.println("Its not an Armstrong");

        }

    }
}