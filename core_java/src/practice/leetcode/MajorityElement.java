package practice.leetcode;


public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {3,2,3, 2, 2,3,2};
		System.out.println(majorityElement(nums));

	}
	
	public static int majorityElement(int nums[]) {
		
		int count = 0;
		int cand =0;
		// moores voting algorithm
		
		for (int i=0; i< nums.length; i++) {
			
			if (count == 0) {
				cand = nums[i];
			}
			
			if (cand == nums[i]) {
				count++;
			} else {
				count--;
			}
			
		}
		
		return cand;
	}

}
