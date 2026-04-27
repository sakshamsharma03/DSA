class OutputPrac02{
    static int func1(int n)
    {
        if(n==1) return 0;
        return 1+func1(n/2);

    }
    
    static int func2(int n)
    {
        System.out.print(n%2);
        if(n==1) return 1;
        return func2(n/2);
    }

    public static void main(String[] args)
    {
        int res1= func1(16);  // will find the floor of log(n) to the base 2
        System.out.println(res1);
        func2(16);  //will print the binary representation of n
    }
}