import java.util.*;

public class AddReverse {
	
	private static int a,b,n;
	
	public static void calculate(){
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		for(int i = 0; i < n; i++){
			a = read.nextInt();
			b = read.nextInt();
			
			a = removeLeading(a);
			a = removeTrailing(a);
			b = removeLeading(b);
			b = removeTrailing(b);
			
			int sum = reverseNum(a) + reverseNum(b);
			
			System.out.println(reverseNum(sum));
		}
	}
	
	// removing zeroes
	public static int removeLeading(int num){
		String numStr = String.valueOf(num);
		numStr.replaceFirst("^0+(?!$)", ""); // replace first occurence starting with 0 + anymore with ""
		int temp = Integer.parseInt(numStr);
		return temp;
	}
	
	public static int removeTrailing(int num){
		String numStr = String.valueOf(reverseNum(num));
		numStr.replaceFirst("^0+(?!$)", "");
		int temp = Integer.parseInt(numStr);
		temp = reverseNum(temp);
		return temp;
	}
	
	public static int reverseNum(int num){
		String numStr = String.valueOf(num);
		StringBuilder sbRev = new StringBuilder();
		sbRev.append(numStr);
		sbRev.reverse();
		numStr = sbRev.toString();
		int temp = Integer.parseInt(numStr);
		return temp;
	}
	
	public static void main(String[] args){
		calculate();
	}
	
}