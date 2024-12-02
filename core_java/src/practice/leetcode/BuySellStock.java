package practice.leetcode;

public class BuySellStock {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {4,3,5,6,8,2,3,4,1};
		System.out.println(maximizeProfit(nums));

	}
	
	// problem 121
	public static int maxProfit(int nums[]) {
		
		int maxProfit = 0;
		int min = nums[0];
		
		for(int i =0; i < nums.length; i++) {
			
			min = Math.min(min, nums[i]);
			int profit = nums[i] - min;
			maxProfit = Math.max(maxProfit, profit);
		}
		
		return maxProfit;
		
	}
	
	// problem 122
	public static int maximizeProfit(int[] nums) {
		
		int profit = 0;
		for(int i=1; i< nums.length; i++) {
			if (nums[i] > nums[i-1]) {
				profit += (nums[i]-nums[i-1]); 
			}
		}
		return profit;
	}

}
