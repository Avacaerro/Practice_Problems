import java.util.*;
public class RansomNote {
	public static boolean canRansom(String rans, String mag){
		if(rans == "" || mag == "") throw new NullPointerException("empty string found");
		Map<String, Integer> hm = new HashMap<>();
		for(String word : mag.toLowerCase().split(" ")){
			if(hm.containsKey(word)) hm.put(word, hm.get(word)+1);
			else hm.put(word, 1);
		} 
		for(String word : rans.toLowerCase().split(" ")){
			if(!hm.containsKey(word)) return false;
			if(hm.get(word) == 1) hm.remove(word);
			else hm.put(word, hm.get(word)-1);
		} 
		return true;
	}
	public static void main(String[] args){
		System.out.print(canRansom("This is your last chance.","In this last edition, you will have a chance. Is today your day?"));
	}
}