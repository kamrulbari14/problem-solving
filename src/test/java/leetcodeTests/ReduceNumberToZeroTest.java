package leetcodeTests;

import leetCode.reduceNumberToZero.ReduceNumberToZero;
import leetCode.validPalindrome.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReduceNumberToZeroTest {

    @Test
    public void checked_With_valid_Input_I() {
        int input = 14;
        ReduceNumberToZero obj = new ReduceNumberToZero();
        Assertions.assertEquals(6, obj.numberOfSteps(input));
    }

    @Test
    public void checked_With_valid_Input_II() {
        int input = 8;
        ReduceNumberToZero obj = new ReduceNumberToZero();
        Assertions.assertEquals(4, obj.numberOfSteps(input));
    }


    @Test
    public void checked_With_valid_Input_III() {
        int input = 800;
        ReduceNumberToZero obj = new ReduceNumberToZero();
        Assertions.assertEquals(12, obj.numberOfSteps(input));
    }
}
