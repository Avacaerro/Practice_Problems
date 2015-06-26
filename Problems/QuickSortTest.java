import java.util.*;
import java.math.*;

class QuickSortTest {
	public static void main(String[] args){
		Random rand = new Random();
		int[] nums = {-15,9,5,2,7,1};
		int[] nums2 = new int[1000];
		for(int i = 0; i < nums2.length; i++){
			nums2[i] = rand.nextInt(1000);
		}
		QuickSort sort = new QuickSort();
		sort.quickSort(nums, 0, nums.length - 1);
		sort.quickSort(nums2, 0, nums2.length - 1);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums2));
	}
}