package easy;


import java.util.*;

public class romanToInteger {

    public static int romanToInt(String s) {
    	Map<Character, Integer> romans = new HashMap<>();
    	romans.put('I', 1);
    	romans.put('V', 5);
    	romans.put('X', 10);
    	romans.put('L', 50);
    	romans.put('C', 100);
    	romans.put('D', 500);
    	romans.put('M', 1000);
    	int result = 0;
    	for(int i=0; i<s.length(); i++) {
    		int first = romans.get(s.charAt(i));
    		if(i==s.length()-1) return result+first;
    		else {
    			int second = romans.get(s.charAt(i+1));
    			if(first<second) {
    				result += second - first; i++;
    			}else {
    				result += first;
    			}
    		}
    		
    	}
    	return result;
    }
    
    public static int romanToInt2(String s) {
        int ans = 0, num = 0;
       for (int i = s.length()-1; i >= 0; i--) {
           switch(s.charAt(i)) {
               case 'I': num = 1; break;
               case 'V': num = 5; break;
               case 'X': num = 10; break;
               case 'L': num = 50; break;
               case 'C': num = 100; break;
               case 'D': num = 500; break;
               case 'M': num = 1000; break;
           }
           if (4 * num < ans) ans -= num;
           else ans += num;
       }
       return ans;
   }
    
    public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
		System.out.println(romanToInt2("IV"));
		System.out.println(romanToInt2("III"));
		System.out.println(romanToInt2("LVIII"));
		System.out.println(romanToInt2("MCMXCIV"));
	}
}
