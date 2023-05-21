package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

	//My solution
	public String longestCommonPrefix(String[] strs) {
		String output = strs[0];
		for(String looking: strs) {
			if(output.length()>looking.length()) {
				output = looking;
			}
		}
		String out = "";
		for(int i =0; i<output.length(); i++) {
			char c = output.charAt(i);
			boolean common = true;
			for(String prefixM : strs) {
				if(prefixM.charAt(i)!=c) {
					common = false;
				}
			}
			if(common) {
				out += c;
			}else break;
		}
		return out;
	}
	
	//Someone's' solution
	//After sorting Lexicographical order
	 public String longestCommonPrefix2(String[] strs) {
	        Arrays.sort(strs);
	        String s1 = strs[0];
	        String s2 = strs[strs.length-1];
	        int idx = 0;
	        while(idx < s1.length() && idx < s2.length()){
	            if(s1.charAt(idx) == s2.charAt(idx)){
	                idx++;
	            } else {
	                break;
	            }
	        }
	        return s1.substring(0, idx);
	    }
	
	public static void main(String[] args) {
		LongestCommonPrefix lele = new LongestCommonPrefix();
		

	}
	
}
