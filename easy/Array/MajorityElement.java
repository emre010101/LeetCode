package Array;
import java.util.*;
import java.util.Map.Entry;

public class MajorityElement {
	
	//My solution
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> list = new HashMap<>();
        for(int num: nums) {
        	if(list.containsKey(num)) {
        		int current = list.get(num);
        		list.put(num, current+1);
        	}else {
            	list.put(num, 1);
        	}
        }
        int max = 0;
        int rKey = 0;
        for(Map.Entry<Integer, Integer> entry : list.entrySet()) {
        	if(entry.getValue()>max) {
        		max = entry.getValue();
        		rKey = entry.getKey();
        	}
        }
        return rKey;
    }
    
    /*LeetCode Solution
     * This algorithm work only if there is majority exist in the array
     * */
    public int majorityElement2(int[] nums) {
        int count = 0, maxElement = 0;
				for(int num: nums) {
					if(count == 0) {
						maxElement = num;
					}
					if(num == maxElement) {
						count++;
					} else {
						count--;
					}
				}

				return maxElement;
    }
    
    public static void main(String[] args) {
		int [] hehe = {0, 2, 4, 6, 56, 6};
		MajorityElement lala = new MajorityElement();
		System.out.println(lala.majorityElement(hehe));
	}
}
