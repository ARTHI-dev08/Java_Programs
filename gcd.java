public class gcd {
    public static void main(String[] args) {
        int a = 36, b = 18;
        int m=a;
        int n=b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}