package leetCode.containerWithMostWater;

public class ContainerWithMostWater {

    /*11. Container With Most Water*/

    public int maxArea(int[] height) {
        int right = 0;
        int left = height.length - 1;
        int maxArea = 0;
        while (right < left) {
            maxArea = Math.max((Math.min(height[right], height[left]) * (left - right)), maxArea);
            if (height[right] >= height[left]) {
                left--;
            } else {
                right++;
            }
        }
        return maxArea;
    }
}
