package dynamic;
import java.util.*;

public class PascalsTriangle2 {
	public List<Integer> getRow(int rowIndex) {
	      //if(rowIndex<0) return null;
	    	List<List<Integer>> result = new ArrayList<>();
	    	for(int i=0; i<=rowIndex; i++) {
	    		List<Integer> row = new ArrayList<>();
	    		row.add(1);
	    		for(int j=1; j<i; j++) {
	    			row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
	    		}
	    		if(i>0) row.add(1);
	    		result.add(row);
	    	}
	    	return result.get(rowIndex);
	    }
}
