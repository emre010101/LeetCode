package easy;

public class RemoveDuplicatesFromSortedArray {

	//private static int[] nums;
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
        for(int k = count; k<nums.length; k++) {
        	nums[k] = 0;
        }
        return count;
    }
    public static void main(String[] args) {
		int[] nums  = {1, 1, 2, 4};
		RemoveDuplicatesFromSortedArray hehe = new RemoveDuplicatesFromSortedArray();
		hehe.removeDuplicates(nums);
		for(int ss : nums) {
			System.out.print(ss + ", ");
		}
	}
}
