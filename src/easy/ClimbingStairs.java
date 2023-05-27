package easy;

public class ClimbingStairs {

	  public int climbStairs(int n) {
	        if(n<=2) return n;
	        int[] dynamic = new int[n];
	        dynamic[0] = 1;
	        dynamic[1] = 2;
	        for(int i=2; i<n; i++){
	            dynamic[i] = dynamic[i-1]+dynamic[i-2];
	        }
	        return dynamic[n-1];
	    }
	  
	  public static void main(String[] args) {
		  ClimbingStairs hehe = new ClimbingStairs();
		System.out.println(hehe.climbStairs(6));
	}
}
