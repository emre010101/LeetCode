package easy;

import java.util.Arrays;

public class MergeSortedArray {
	
	//My
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int[] temp = new int[m+n];
    	int k=0, j=0, i=0;
    	while(k<m && j<n) {
    		if(nums1[k]<nums2[j]) {
    			temp[i++] = nums1[k++];
    		}else {
    			temp[i++] = nums2[j++];
    		}
    	}
    	while(k<m) {
    		temp[i++] = nums1[k++];
    	}
    	while(j<n) {
    		temp[i++] = nums2[j++];
    	}
    	for(int index=0; index<m+n; index++) {
    		nums1[index]=temp[index];
    	}
    }
    
    //LeetCode
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
    	for(int i=0; i<n; i++) {
    		nums1[m] = nums2[i];
    		m++;
    	}
    	Arrays.sort(nums1);
    }
public static void main(String[] args) {
	int[]nums1 = {1,2,3,0,0,0}; int m = 3; int[]nums2 = {2,5,6}; int n = 3;
	MergeSortedArray hehe = new MergeSortedArray();
	hehe.merge(nums1, m, nums2, n);
	for(int i: nums1) {
		System.out.print(i +", ");
	}
}
}
