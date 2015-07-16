import java.util.*;
public class RansomNote {
	public static boolean canRansom(String rans, String mag){
		if(rans == "" || mag == "") throw new NullPointerException("empty string found");
		String[] magArr = mag.toLowerCase().split(" ");
		String[] ransArr = rans.toLowerCase().split(" ");
		HashSet hs = new HashSet<String>();
		for(String word : magArr) hs.add(word);
		for(String word : ransArr) if(!hs.contains(word)) return false;
		return true;
	}
	public static void main(String[] args){
		System.out.print(canRansom("This is your last chance.","In this last edition, you will have a chance. Is today your day?"));
	}
}