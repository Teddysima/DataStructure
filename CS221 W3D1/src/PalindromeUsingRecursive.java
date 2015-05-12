
public class PalindromeUsingRecursive {

    public static void main (String[] args) {

        String str = "hi";

        if (isPalindrome (str))
            System.out.println ("Yes");
        else
            System.out.println ("No");
    }

    public static boolean isPalindrome (String str) {

        if (str == null || str.length () <= 1)
            return true;

        char chFirst = str.charAt (0);
        char chLast = str.charAt (str.length () - 1);

        if (chFirst == chLast)
            return isPalindrome (str.substring (1, str.length () - 1));

        return false;
    }

}
