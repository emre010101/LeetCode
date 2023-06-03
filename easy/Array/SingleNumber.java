package Array;
import java.util.*;

public class SingleNumber {

	//My solution using hashmap
    public int singleNumber(int[] nums) {
    	if(nums.length==0) return 0;
    	Map<Integer, Integer> occured = new HashMap<>();
    	for(int num : nums) {
    		if(occured.containsKey(num)) {
    			occured.put(num, 1);
    		}else {
    			occured.put(num, 0);
    		}
    	}
    	for(Map.Entry<Integer, Integer> entry : occured.entrySet()) {
    		if(entry.getValue().equals(0)) {
    			return entry.getKey();
    		}
    	}
    	return 0;
    }
    
    //LetCode solution with default sorting
    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
       return nums[nums.length-1];
    }
}
