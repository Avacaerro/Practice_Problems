class FindUncoupledTest {
	
	public static void main(String[] args){
		int[] array = {2, 7, 2, 8, 5, 1, 1, 7, 8};
		FindUncoupled uncoupled = new FindUncoupled();
		System.out.println(uncoupled.findUncoupled(array));
		System.out.println(uncoupled.bitwiseFindUncoupled(array));
	}
}