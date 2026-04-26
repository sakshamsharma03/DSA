class TrailingZero
{
  static int trailedZero(int n)
  {
   int res=0;
// This is the Naive solution, which fails for greater val of n,
// if n>12 the int fails, then long comes. This all is inefficient   
//    int factorialNumber=FactorialNumber.factorialCalc(n);
//    while(factorialNumber%10==0)
//    {
//     res++;
//     factorialNumber/=10;
//    }

// Better Approach-> only finding out the count of num having 5 as its factor
for(int i=5;i<=n;i=i*5)
{
    res=res+(n/i);
}
   return res;
  }
  public static void main(String[] args)
  {
    int result = trailedZero(25);
    System.out.println("Trailed Zero = "+result);
  }
}