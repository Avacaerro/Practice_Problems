import java.util.*;

class PrimeGenerator {
	
	public static void primeGenerator(){
		Scanner read = new Scanner(System.in);
		int numInputs = read.nextInt();
		for(int i = 0; i < numInputs; i++){
			int start = read.nextInt();
			int end = read.nextInt();
			for(int j = start; j < end; j++){
				if(j == 1){
					j++;
				}
				if(j == 2){
					System.out.println(j);
				}
				if(j%2 == 0){
					j++;
				}
				if(isPrime(j)){
					System.out.println(j);
				}
			}
			System.out.println("");
		}
	}
	
	public static boolean isPrime(int n){
		int i = 2;
		while(i <= Math.sqrt(n)){
			if(n%i == 0){
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void main(String[] args){
		primeGenerator();
	}
}