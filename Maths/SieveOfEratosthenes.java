import java.util.Arrays;
class SieveOfEratosthenes{ // progaram to find prime number till the given n
    static boolean isPrime(int n)
    {
        if (n<=2 || n<=3) return true;
        if(n%2==0) return false;
        if(n%3==0) return false;

        for(int i = 5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }

    static void sieve(int n)
    {
       boolean[] checker= new boolean[n+1];
       Arrays.fill(checker,true);
       for(int i=2;i<=n;i++)
       {
        if(checker[i])
        {
            System.out.println(i);
            for(int j= i*i;j<=n;j=j+i)
            {
                checker[j]=false;
            }
        }
       }

    }
    public static void main(String [] args)
    {
      //naive approach
      int n = 100;
    //   for(int i=2;i<=n;i++)
    //   {
    //     if(isPrime(i))
    //     {
    //         System.out.println(i);
    //     }
    //   }

    sieve(n);

    }
}