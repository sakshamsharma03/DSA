class LCM{
    static int lcmCal(int a, int b)
    {
        int n=0;
        if(a>b){
            n=a;
        }else{
            n=b;
        }
        while(true)
        {
            if(n%a==0 && n%b==0)
            {
                break;
            }
            n++;
        }
        return n;
    }
    public static void main(String[] args){
      //int result=lcmCal(4,6);
      int gcd=GCD.eucledianAlgo(4,6);
      System.out.println((4*6)/gcd);
    }
}