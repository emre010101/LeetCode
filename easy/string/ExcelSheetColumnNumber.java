package string;

public class ExcelSheetColumnNumber {
	
	/*we get the equal number value for first character
	 * after the first iteration 
	 * then we multiply that with 26 as it's the first digit of 2 numbers
	 * then get the sum of these to return.
	 * */
    public int titleToNumber(String columnTitle) {
    	int result = 0;
        for(int i=0; i<columnTitle.length(); i++) {
        	result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

}
