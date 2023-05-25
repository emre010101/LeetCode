package easy;

public class FindtheIndexoftheFirstOccurrenceinaString {

	public int strStr(String haystack, String needle) {
        int indexN =0;
    	for(int i=0; i<=haystack.length()-needle.length(); i++) {
    		int k = i;
    		while(haystack.charAt(k) == needle.charAt(indexN) && k<haystack.length()-1 && indexN<needle.length()-1) {
    				k++; indexN++;
    			}
    			if(needle.charAt(indexN)==haystack.charAt(k)) return i;
    			else indexN=0;
    		}
    	return -1;
    }
	
    public int strStr2(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
	
	public static void main(String[] args) {
    	FindtheIndexoftheFirstOccurrenceinaString hehe = new FindtheIndexoftheFirstOccurrenceinaString();
    	String haystack = "sadbutsad", needle = "sad";
    	System.out.println(hehe.strStr(haystack, needle));
    	System.out.println("The secon example");
    	String haystack2 = "leetcode", needle2 = "leeto";
    	System.out.println(hehe.strStr(haystack2, needle2));
    	System.out.println("Going for the 3th example:");
    	String haystack3 = "a", needle3 = "a";
    	System.out.println(hehe.strStr(haystack3, needle3));
	}
}
