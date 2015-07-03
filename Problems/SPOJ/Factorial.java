import java.util.*;

public class Factorial {
	
	public static void calculateTrailingZeroes(){
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		for(int i = 0; i < a; i++){
			int count = 0;
			int n = read.nextInt();
			if(n < 0){	// error condition
				break;
			}
			for(long j = 5; n/j >= 1; j *= 5){
				count += n/j;
			}

			System.out.println(count);
		}
		
	}
	
	public static void main(String[] args){
		calculateTrailingZeroes();
	}
	
}