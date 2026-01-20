public class SearchRange_34 {
    public int[] searchRange(int[] nums, int target) {//4,5,6,7,0,1,2
        if (nums.length == 0) return new int[] {-1, -1};
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] == nums[end]) break;
            if (nums[start] == target) {

            } else start++;
            if (nums[end] == target) {

            } else end--;
        }
        if (nums[start] == target && nums[end] == target) {
            return new int[] {start, end};
        }
        return new int[] {-1, -1};
    }
}
