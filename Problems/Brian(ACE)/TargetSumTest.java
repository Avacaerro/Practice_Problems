class TargetSumTest {
	
	public static void main(String[] args){
		int[] nums = {1, 15, 20, 6, 4};
		int[] nums2 = {0, 15, 20, 6, 4};
		int[] nums3 = {-5, 13, 0, 16, 4};
		int[] nums4 = {};
		TargetSum tSum = new TargetSum();
		System.out.println(tSum.hasTargetSum(nums, 15));
		System.out.println(tSum.hasTargetSum(nums2, 15));
		System.out.println(tSum.hasTargetSum(nums3, -1));
		System.out.println(tSum.hasTargetSum(nums4, -1));
	}
	
}