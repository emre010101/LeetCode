package easy;

public class SearchInsertPosition {
	
    public int searchInsert(int[] nums, int target) {
        int upperB = nums.length-1;
    	int lowerB = 0;
    	int mid=1;
    	while(lowerB<=upperB) {
    		mid = (upperB+lowerB)/2;
    		if(nums[mid] == target) return mid;
    		else if(nums[mid]>target) upperB = mid-1;
    		else lowerB=mid+1;
    	}
    	if(target<nums[mid]) {
    		return mid;
    	}
    	else return mid+1;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		SearchInsertPosition hehe = new SearchInsertPosition();
		System.out.println(hehe.searchInsert(nums, 0));
	}
}
