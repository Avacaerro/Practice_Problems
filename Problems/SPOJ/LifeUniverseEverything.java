import java.util.*;

public class LifeUniverseEverything {
	
	public static void fortyTwo(){
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		System.out.println(a);
		while(a != 42){
			a = read.nextInt();
			if(a == 42){
				break;
			}
			System.out.println(a);
		}
	}
	
	public static void main(String[] args){
		fortyTwo();
	}
	
}