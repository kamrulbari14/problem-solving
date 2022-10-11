package leetcodeTests;

import leetCode.longestNiceSubstring.LongestNiceSubstring;
import leetCode.validPalindrome.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestNiceSubstringTests {

    @Test
    public void checked_With_valid_Input_I() {
        String input = "YazaAay";
        LongestNiceSubstring obj = new LongestNiceSubstring();
        Assertions.assertEquals("aAa", obj.longestNiceSubstring(input));
    }

}
