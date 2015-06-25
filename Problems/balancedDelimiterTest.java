import java.util.*;

class balancedDelimiterTest {
	public static void main(String[] args){
		String delimiters1 = "[()";
		String delimiters2 = "[]{()}()";
		String delimiters3 = "[]{(23425)asfjwehrjk}(gaewre)";
		balancedDelimiter check = new balancedDelimiter();
		System.out.println(check.isBalanced(delimiters1));
		System.out.println(check.isBalanced(delimiters2));
		System.out.println(check.isBalanced(delimiters3));
	}
}