public class Palindrome {
    public static void main(String[] args) {
        String str = "amma";
        System.out.print(isPalindrome(str));
    }

    private static boolean  isPalindrome(String str) {
        int n = str.length();
        if(n<=1) return true;
        if(str.charAt(0)!=str.charAt(n-1)) return false;
        String substr = str.substring(1,n-1);
        return isPalindrome(substr);
    }
    
}
