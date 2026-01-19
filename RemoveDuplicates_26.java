public class RemoveDuplicates_26 {
    int removeDuplicates(int[] nums){//1, 2, 3, 3, 4, 4, 4, 5
        int pnt = 0;
        System.out.println(nums.length);
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] != nums[pnt]) {
                nums[++pnt] = nums[i];
                continue;
            }
        }
        for (int i = 0; i < pnt + 1; i++) {
            System.out.print(" " + nums[i]);
        }
        return pnt;
    }
}
