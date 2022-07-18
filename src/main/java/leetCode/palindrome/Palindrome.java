package leetCode.palindrome;

public class Palindrome {

    /*9. Palindrome Number*/

    public boolean isPalindrome(int x) {
        int check = x, reverse = 0, remainder;
        boolean result = false;
        while (check > 0) {
            remainder = check % 10;
            reverse = reverse * 10 + remainder;
            check = check / 10;
        }
        if (reverse == x) result = true;
        return result;
    }
}
