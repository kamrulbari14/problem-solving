package leetcodeTests;

import leetCode.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void checked_With_valid_Input_I() {
        String input = "A man, a plan, a canal: Panama";
        ValidPalindrome obj = new ValidPalindrome();
        Assertions.assertEquals(true, obj.isPalindrome(input));
    }

    @Test
    public void checked_With_valid_Input_II() {
        String input = "race a car";
        ValidPalindrome obj = new ValidPalindrome();
        Assertions.assertEquals(false, obj.isPalindrome(input));
    }
}
