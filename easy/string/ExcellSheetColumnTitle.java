package string;

public class ExcellSheetColumnTitle {
	
    public String convertToTitle(int columnNumber) {
        StringBuffer togo = new StringBuffer();
        while(columnNumber>0) {
        	columnNumber--;
        	char current = (char)('A' + (columnNumber%26));
        	togo.append(current);
        	columnNumber/=26;
        }
        return togo.reverse().toString();
    }

}
