package practice.leetcode;


import java.util.Arrays;

// Q88
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,3,5};
		
		mergeSortedArray(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));

	}
	
	public static void mergeSortedArray(int nums1[], int m, int nums2[], int n) {
		
		int i = m-1;
		int j = n-1;
		int k = m+n-1;
		
		while( j >= 0 ) {
			
			if (i>=0 && nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				k--;
				i--;
			} else {
				nums1[k] = nums2[j];
				k--;
				j--;
			}
			
		}
		
	}

}

