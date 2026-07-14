import java.util.Scanner;
class leap{
    public static void main(String [] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Year: ");

        int year=ob.nextInt();
        if(year%400==0){
            System.out.println("its leap year");
        }
        else if(year%100==0){
            System.out.println("its not leap year");
        }
        else if(year%4==0){
            System.out.println("its leap year");

        }
        else{
            System.out.println("Its not an leap year");

        }
    }
}