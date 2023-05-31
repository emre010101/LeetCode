package calc;

import java.util.Arrays;
import java.util.Collections;

public class BestTimetoBuyandSellStock {
	
	//my sol: too slow
    public int maxProfit(int[] prices) {
        int currentDif =0;
        int overalDif =0;
        int minNum = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
        	if(prices[i]<minNum) minNum = prices[i];
        	currentDif = prices[i] - minNum;
        	if(currentDif>overalDif) {
        		overalDif = currentDif;
        	}
        }
        return overalDif;
    }
    
    //The buy value should come before the sell value so it wont work
    public int maxProfit2(int[] prices) {
    	Arrays.sort(prices);
    	return prices[prices.length-1] = prices[0];
    }
}
