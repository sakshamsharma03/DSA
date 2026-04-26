class PalindromeNumber{
    static boolean palindromeChecker(int n)
    {
        int temp=n;
        int reversedNumber=0;
        while(temp>0)
        {
            int rem=temp%10;
            reversedNumber=(reversedNumber*10)+rem;
            temp=temp/10;
        }
        return (n==reversedNumber);
    }
    public static void main(String[] args)
    {
        System.out.println("hellooooo");
        boolean result=palindromeChecker(333323333);
        System.out.println("Is it a palindrome? "+result);
    }
}