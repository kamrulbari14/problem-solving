package leetCode;

public class ValidPalindrome {

    /*125. Valid Palindrome*/

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        StringBuffer sbr = new StringBuffer(s);
        String reverse = String.valueOf(sbr.reverse());
        return reverse.equals(s);
    }
}
