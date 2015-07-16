class SearchArray {
	
	public static int search(int[] array, int target){
		for(int i = 0; i < array.length; i++){
			if(array[i] == target) return i;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] array = {1,5,7,9,10,18};
		System.out.print(search(array, 15));
	}
}