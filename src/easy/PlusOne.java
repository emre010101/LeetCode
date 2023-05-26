package easy;

public class PlusOne {
	//static String s;

	//My
    public int[] plusOne(int[] digits) {
        String s = "";
        for(int k : digits) {
        	s += k;
        }
        java.math.BigInteger t = new java.math.BigInteger(s);
        t = t.add(java.math.BigInteger.ONE);
    	s = String.valueOf(t);
    	int[] tobe = new int[s.length()];
    	for(int i=0; i<s.length(); i++) {
    		tobe[i] = Character.getNumericValue(s.charAt(i));
    	}
    	return tobe;
    }
    
    //LeetCode
    public int[] plusOne2(int[] digits) {
    	for (int i = digits.length - 1; i >= 0; i--) {
    		if (digits[i] < 9) {
    			digits[i]++;
    			return digits;
    		}
    		digits[i] = 0;
    	}

    	digits = new int[digits.length + 1];
    	digits[0] = 1;
    	return digits;
    }
     
    
    public static void main(String[] args) {
		int [] hehe = {1, 2, 3};
		PlusOne heheh = new PlusOne();
		int[] keke = heheh.plusOne(hehe);
		for(int i : keke) {
			System.out.print(i + ", ");
		}
		
	}
}
