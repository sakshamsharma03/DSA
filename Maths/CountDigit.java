class CountDigit{
    static int digitCounter(int n)
    {
        int res=0;
        while(n>0)
        {
            n=n/10;
            res++;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println("Hellloo World");
        int result=digitCounter(128);
        System.out.println("Counted Digit "+result);
    }
}