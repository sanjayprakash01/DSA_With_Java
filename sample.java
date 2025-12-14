public class sample {
    public static void main(String[] args) {
        TwoSum_1 obj = new TwoSum_1();
        int[] arr = obj.twoSum(new int[] {2,7,11,15}, 9);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
