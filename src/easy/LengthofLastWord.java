package easy;

public class LengthofLastWord {

	
    public int lengthOfLastWord(String s) {
    	int count=0;
        for(int i=s.length()-1; i>=0; i--) {
        	if(Character.isLetter(s.charAt(i))) {
        		count++;
        	}else if(!Character.isLetter(s.charAt(i)) && count!=0){
        		return count;
        	}
        }
    	return count;
    }
}
