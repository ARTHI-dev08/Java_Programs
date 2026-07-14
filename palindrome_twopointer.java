import java.sql.SQLOutput;

public class palindrome_twopointer {
    public static void main(String []args){
        String str="malayalam";
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
