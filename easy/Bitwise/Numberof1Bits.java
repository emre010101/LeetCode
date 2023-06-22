package Bitwise;

public class Numberof1Bits {
	
    public int hammingWeight(int n) {
    	if(n==0) return 0;
    	
    	int result = 0;
    	
    	for(int i=0; i<32; i++) { //as it's 32 number in one bit in java
    		if((n & 1) == 1) result++; //checking each bit
    		n >>= 1;	//shifting to right to check the most least bit in the next iteration
    	}
    	
    	return result;
    }

}
