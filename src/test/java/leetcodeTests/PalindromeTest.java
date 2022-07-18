package leetcodeTests;

import leetCode.palindrome.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void checked_With_valid_Input_I() {
        int input = 121;
        Palindrome obj = new Palindrome();
        Assertions.assertTrue(obj.isPalindrome(input));
    }

    @Test
    public void checked_With_valid_Input_II() {
        int input = 1212221112;
        Palindrome obj = new Palindrome();
        Assertions.assertFalse(obj.isPalindrome(input));
    }

    @Test
    public void checked_With_valid_Input_III() {
        int input = 121212121;
        Palindrome obj = new Palindrome();
        Assertions.assertTrue(obj.isPalindrome(input));
    }
}
