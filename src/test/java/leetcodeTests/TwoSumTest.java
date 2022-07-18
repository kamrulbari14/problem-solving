package leetcodeTests;

import leetCode.twoSum.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void checked_With_valid_Input_I() {
        int[] input = {3, 1, 2, 4};
        int[] result = {2, 3};
        TwoSum obj = new TwoSum();
        Assertions.assertArrayEquals(result, obj.twoSum(input, 6));
    }

    @Test
    public void checked_With_valid_Input_II() {
        int[] input = {2, 7, 11, 15};
        int[] result = {0, 1};
        TwoSum obj = new TwoSum();
        Assertions.assertArrayEquals(result, obj.twoSum(input, 9));
    }
}
