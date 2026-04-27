class PrintN{
    static void func(int n)
    {
        if(n==0) return;
        System.out.println(n);
        func(n-1);
    }
    static void func1(int n)
    {
        if (n==0) return;
        func1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        func(10);
        func1(5);
    }
}