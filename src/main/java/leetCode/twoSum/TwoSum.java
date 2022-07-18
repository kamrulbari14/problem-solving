package leetCode.twoSum;

public class TwoSum {

    /*1. Two Sum*/

    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        int length = nums.length;
        int[] result = new int[0];
        for (int num : nums) {
            for (int i = index + 1; i < length; i++) {
                if (num + nums[i] == target) {
                    result = new int[]{index, i};
                }
            }
            ++index;
        }
        return result;
    }
}
