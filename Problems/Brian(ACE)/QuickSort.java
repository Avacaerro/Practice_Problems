import java.util.*;

class QuickSort {
	
	public void quickSort(int[] array, int left, int right){
		if(left < right){
			int pivot = partition(array, left, right);
			quickSort(array, left, pivot - 1);
			quickSort(array, pivot + 1, right);
		}
	}
	
	public int partition(int[] array, int left, int right){
		int pivotNum = array[right];
		int leftwall = left - 1;		// leftwall knows the location of the number greater than the pivot 
		for(int j = left; j < right; j++){
			if(array[j] <= pivotNum){
				leftwall++;
				swap(array, leftwall, j); // swaps leftwall with the num(j) smaller than pivot 
			}
		}
		swap(array, leftwall+1, right); // Swaps pivotNum and number(array[leftwall+1]) greater before it
		return leftwall+1; 				// returns next pivot
	}
	
	public void swap(int[] array, int left, int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
}