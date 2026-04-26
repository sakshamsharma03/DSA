class GCD{
    static int gcdCal(int a, int b)
    {
    int n=0; 
      if(a<b)
      {
        n=a;
      }else
      {
        n=b;
      }
      while(n>=1)
      {
        if(a%n==0 && b%n==0)
        {
          break;
        }
        n--;
      }
      return n;
    }
    static int eucledianAlgo(int a, int b)
    {
        if(b==0){
            return a;
        }else{
            return eucledianAlgo(b,a%b);
        }
    }
    public static void main(String[] args)
    {
        int result = eucledianAlgo(14,21);
        System.out.println("GCD / HCF-> "+result);
    }
}