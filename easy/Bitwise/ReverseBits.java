package Bitwise;

public class ReverseBits {
	
	  public int reverseBits(int n) {
	        if(n==0) return 0;
	        int result = 0;
	        for(int i=0; i<32; i++){ //as every integer represented in 32bits under the hood
	            result <<= 1; //shift to left to let some space for next comparison
	            if((n & 1)==1) result++; //if the last bit is one add it
	            n >>= 1; //shift to right
	        }
	        return result;
	    }

}
