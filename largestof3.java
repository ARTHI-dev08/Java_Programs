import java.util.Scanner;
class largest {
    public static void main(String[] args)


    {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter three values: ");

        int n1 = ob.nextInt();
        int n2 = ob.nextInt();
        int n3 = ob.nextInt();
        if(n1>=n2 && n1>=n3){
            System.out.println(n1 +" is greater");
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println(n2 +" is greater");

        }
        else{
            System.out.println(n3 +" is greater");

        }
//        if (n1 > n2) {
//            if (n1 > n3) {
//                System.out.println("n1 is greater");
//            } else {
//                System.out.println("n3 isgreater");
//            }
//        }
//        else if (n2 > n3) {
//            if(n2>n1){
//                System.out.println("n2 is greater");
//            }
//            else{
//                System.out.println("n1 isgreater");
//
//            }
//                    }
//        else if(n3>n1){
//            if(n3>n2){
//                System.out.println("n3 isgreater");
//
//            }
//            else{
//                System.out.println("n2 isgreater");
//
//            }
//        }
// this code is complicated and does not work when two number equals..so always keep simple

    }
}