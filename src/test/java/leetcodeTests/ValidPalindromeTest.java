package leetcodeTests;

import leetCode.validPalindrome.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void checked_With_valid_Input_I() {
        String input = "A man, a plan, a canal: Panama";
        ValidPalindrome obj = new ValidPalindrome();
        Assertions.assertTrue(obj.isPalindrome(input));
    }

    @Test
    public void checked_With_valid_Input_II() {
        String input = "race a car";
        ValidPalindrome obj = new ValidPalindrome();
        Assertions.assertFalse(obj.isPalindrome(input));
    }
}
