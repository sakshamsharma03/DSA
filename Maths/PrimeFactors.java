class PrimeFactors{ // factors of a given number which is prime
   static void getAllPrimeFactors(int n)
   {
    if(n==1) System.out.println("NAPF");
    while(n%2==0)
    {
        System.out.println(2);
        n/=2;
    }
    while(n%3==0)
    {
        System.out.println(3);
        n/=3;
    }
    for(int i=5;i*i<=n;i=i+6)
    {
        while(n%i==0)
        {
            System.out.println(i);
            n/=i;
        }
         while(n%(i+2)==0)
        {
            System.out.println(i+2);
            n/=(i+2);
        }
    }
    if(n>1) System.out.println(n);
   }
   public static void main(String[] srgs)
   {
      getAllPrimeFactors(30); // Product of all PF's is the number itself
   }
}