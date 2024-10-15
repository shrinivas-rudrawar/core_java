package practice.leetcode;


public class RemoveDuplicateSortedArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,1,2,2,3,3,4,4,4,5};
		System.out.println(removeDuplicateFromSortedArray(nums));
		
		System.out.println(removeDuplicateThirdFromSortedArray(nums));

	}
	
	// problem 26
	public static int removeDuplicateFromSortedArray (int nums[]) {
		int count = 0;
		
		for (int i=0; i< nums.length; i++) {
			
			if(i < nums.length-1 && nums[i] == nums[i+1]) {
				continue;
			} else {
				nums[count] = nums[i];
				count++;
			}
			
			
		}
		
		return count;
	}
	
	// problem 80
	public static int removeDuplicateThirdFromSortedArray(int nums[]) {
		
		int i=0;
		
		for(int n : nums) {
			if (i<2 || n!= nums[i-2]) {
				nums[i++] = n;
			}
		}
		
		return i;
		
	}
	

}

