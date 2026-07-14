class dtypes{
    public static void main(String[] args){
        byte a=127;//-128-127
        short b=32000;//32k
        int c=2000000000;//2b
        long d=2000000000000L;
        float e=95.5f;
        double f=1.2222222;//for long values
        boolean g=true;
        char h='a';
        // cant print like this System.out.println(a,b,c); since println accept one argument hence :
        System.out.println(a+ " "+b+" "+c+" "+d);//like this
        System.out.println(a+ "\n"+b+"\n "+c+"\n"+d);//like this to print it one bby one


    }
}