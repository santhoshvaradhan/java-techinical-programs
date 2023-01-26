// Longest palindromic substring in java
class LPS {
    public static String palindromic(String str)
    {
        int maxlength=0;
        String palindromestring=null;
        for(int i=0;i<str.length();i++)
        {
            for( int j=i+1;j<str.length();j++)
            {
                int len=j-i;
                String substring=str.substring(i,j+1);
                if(ispalindrome(substring))
                {
                    if(len>maxlength)
                    {
                        maxlength=len;
                        palindromestring=substring;
                    }
                }
            }
        }
        return palindromestring;
    }
    public static boolean ispalindrome(String str)
    {
        for( int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
     String Substring=palindromic("aaabcd");
     System.out.println("longest palindromic substring:"+Substring);
    }
}
