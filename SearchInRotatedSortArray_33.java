public class SearchInRotatedSortArray_33 {
    int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int start = 0;
        if (nums[start] >= target) {//4,5,6,7,0,1,2
        
            start = nums.length - 1;
            while (start >= 0) {
                if (nums[start] == target) return start; 
                start--;
            }
        } else if (nums[start] < target) {
            while (start <= nums.length - 1) {
                if (nums[start] == target) return start;
                start++;
            }
        }
        return -1;
    }
}
