import java.util.Date;
class dtype{
    public static void main(String [] args) {

        int a = 10;
        int b = a;
        a = 5;
        System.out.println(a);//Primitive datatypes
        System.out.println(b);//since memory allocated separately for both a and b..no link

        //reference data type below--
        Date today=new Date();
        System.out.println(today);//prints todays dat
        //point not working--reference data type just store the address of the place where that value stored p1=5,7
        //then p1=p2 means p2 7= p1 store just the address of that 5,7..hence further change sin the point change both.

    }


}