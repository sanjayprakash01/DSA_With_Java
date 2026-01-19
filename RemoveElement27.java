public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int start = 0;
        int end = nums.length - 1;
        System.out.println(end+ "::::::"+(start <= end));
        while (start <= end) {System.out.println(nums[start] + "  " + nums[end]);
            if (nums[start] != val) {
                start++;
                continue;
            } else if (nums[end] != val) {
                nums[start] = nums[end];
                end--;
                start++;
                continue;
            } else end--;
        }   
        return start;
    }
}
