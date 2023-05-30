package easy;

import java.util.*;

public class Sqrt {

	 public int mySqrt(int x) {
	        int low = 1 , high = x  , ans = 0;

	            while (low <= high){
	              int mid = low + (high - low) /2;

	                if (x/mid == mid) return mid;
	                else if (x/mid < mid)  high = mid-1;
	                else {
	                    low= mid + 1; ans=mid;
	                }
	            }
	        return ans;
	    }

	public static double mySqrt2(int x) {
		double temp;

		double sr = x / 2;

		do {
			temp = sr;
			sr = (temp + (x / temp)) / 2;
		} while ((temp - sr) != 0);

		return (int)sr;
	}

	public static void main(String[] args) {
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		System.out.println("Square root of " + num + " is: " + mySqrt2(num));
		System.out.println(2);
	}
}
