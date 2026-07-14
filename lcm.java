public class lcm {

        public static void main(String[] args) {
            int a = 36, b = 18;
            int m=a;
            int n=b;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            int lcm=m*n/a;
            System.out.println(lcm);
        }
    }
