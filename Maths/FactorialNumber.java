class FactorialNumber{
    static int factorialCalc(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
       int result=factorialCalc(5);
       System.out.println(result);
    }
}