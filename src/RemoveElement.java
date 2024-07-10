public class RemoveElement {
    //移除元素
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while(fast< nums.length){
            if (nums[fast] == val){
                fast++;
            } else {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }
        return slow;
    }


    public int removeElement2(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        while (fast< nums.length){
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
