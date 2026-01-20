public class SearchInsertPos_35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int s = 0;
        int e = nums.length - 1;        
        while (s <= e) {
            if (nums[e] < target) {
                return e + 1;
            }
            if (nums[s] >= target) {
                return s;
            }
            if (nums[e] <= target) {
                return e;
            }
            s++;
            if (s != e) e--;
        }
        return 0;
    }
}
