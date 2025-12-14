import java.util.HashMap;

class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (hm.containsKey(remain) && hm.get(remain) != i) {
                return new int[] {hm.get(remain), i};
            }
        }
        return new int[]{};    
    }

    public void twoSum(Class<int[]> class1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'twoSum'");
    }
}
