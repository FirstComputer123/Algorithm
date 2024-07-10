public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] nums2 = new int[nums.length];
        int index = nums2.length-1;
        while (left <= right){
            if (nums[right] * nums[right] > nums[left] * nums[left]){
                nums2[index] = nums[right] * nums[right];
                right--;
            } else {
                nums2[index] = nums[left] * nums[left];
                left++;
            }
            index--;
        }
        return nums2;

    }
}
