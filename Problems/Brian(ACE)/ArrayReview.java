import java.util.*;
class ArrayReview {

	public static void printContents(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static int search(int[] array, int target){
		for(int i = 0; i < array.length; i++){
			if(array[i] == target) return i;
		}
		return -1;
	}
	// Durstenfeld Fisher Yates shuffle
	public static int[] shuffle(int[] array){
		for(int i = array.length-1; i >= 1; i--){
			int r = (int) (Math.random() * i);
			System.out.println(r);
			swap(array, r, i);
		}
		return array;
	}
	//swapping without temp variable
	public static void swap(int[] array, int a, int b){
		array[a] = array[a] + array[b];
		array[b] = array[a] - array[b];
		array[a] = array[a] - array[b];
	}
	
	public static int[] rotate(int[] array, int k){
		reverse(array, 0, k-1); //reverse first sub array
		reverse(array, k, array.length-1); //reverse second sub array
		reverse(array, 0, array.length-1); //reverse entire array
		return array;
	}
	
	public static void reverse(int[] array, int left, int right){
		for(int i = left; i <= (left+right)/2; i++){
			System.out.print(" "+i + ((left+right)-i) + left + right);
			swap(array, i, (left+right)-i);
		}
	}
	
	public static int[] sort(int[] array){
		for(int i = 1; i < array.length; i++){
			int j = i;
			while(j > 0 && array[j-1] > array[j]){
				swap(array, j-1, j);
				j--;
			}
		}
		return array;
	}

	public static void main(String[] args){
		int[] array = {1,0,5,3,4};
		System.out.print(Arrays.toString(sort(array)));
	}
}