package easy;

public class RemoveElement {

	//My solution
    public int removeElement(int[] nums, int val) {
    	if(nums.length ==0) return 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++) {
        	if(nums[i] != val) {
        		nums[count++] = nums[i];
        	}
        }
        for(int k = count; k<nums.length; k++) {
        	nums[k] = 0;
        }
        return count;
    }
    
    //LeetCode solution
    public int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
