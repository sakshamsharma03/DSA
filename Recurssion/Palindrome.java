class Palindrome{
    static boolean checkIfPAlindrome(String s, int start, int end)
    {
        if(start>=end) return true;
        if(s.charAt(start)==s.charAt(end)) return checkIfPAlindrome(s, start+1,end-1);
        return false;
    }
    public static void main(String [] args)
    {
       System.out.println(checkIfPAlindrome("naan",0,3));
    }
}