class TargetSum {
	
	public boolean hasTargetSum(int[] array, int target){
		QuickSort sort = new QuickSort();
		sort.quickSort(array, 0, array.length - 1);
		int rPointer = array.length - 1;
		int lPointer = 0;
		while(lPointer < rPointer ){
			int check = array[lPointer] + array[rPointer];
			if(check == target){
				return true;
			} else if(check < target){
				lPointer++;
			} else {
				rPointer--;
			}
		}
		return false;
	}
	
}