package string;

public class ValidPalindrome {

	//My Solution
	/*O(n) time complexity*/
    public boolean isPalindrome(String s) {
        StringBuffer he = new StringBuffer();
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if(Character.isAlphabetic(c) || Character.isDigit(c)) {
        		he.append(c);
        	}
        }
        s= he.toString().toLowerCase();
        for(int i=0; i<s.length()/2; i++) {
        	if(!(s.charAt(i) == s.charAt(s.length()-i-1)))  return false;
        }
        return true;
    }
    
    /*LeetCode implementation 
     * the difference is in this approach time complexity is O(n) AND SPACE IS O(1) 
     * Slightly faster as it iterates over only once*/
    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}
