import java.util.Scanner;
public class digits{
    public static int countnum(int n){
        int count=0;
        while(n!=0) {
            count = count + 1;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=ob.nextInt();
        int digitsc=countnum(num);
        System.out.println(digitsc);

        }

    }
