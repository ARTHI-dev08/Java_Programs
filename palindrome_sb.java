import java.util.*;
public class palindrome_sb {
    public static void main(String[]args){
        String str="malayalam";
        String sb=new StringBuilder(str).reverse().toString();//don't prefer
        if(str.equals(sb)){
            System.out.println("palin");
        }
        else{
            System.out.println("no palindrome");
        }
    }
}
