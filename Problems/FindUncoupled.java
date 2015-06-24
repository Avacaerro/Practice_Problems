import java.util.*;

class FindUncoupled {
	
	public Set<Integer> findUncoupled(int[] array){
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < array.length; i++){
			if(set.contains(array[i])){
				set.remove(array[i]);
			} else {
				set.add(array[i]);
			}
		}
		return set;
	}
	
	public int bitwiseFindUncoupled(int[] array){
		int ans = array[0];
		for(int i = 1; i < array.length; i++){
			ans = ans^array[i];
		}
		return ans;
	}
}