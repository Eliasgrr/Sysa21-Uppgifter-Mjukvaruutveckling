
public class enhancedForLoop {
	

	public static void main(String[] args) {

		int[] array = new int[3];
		
		array[0] = 93;
		array[1] = 11;
		array[2] = 138;
		
		int[] secondArray = new int[3];
		
		secondArray[0] = 20;
		secondArray[1] = 15;
		secondArray[2] = 88;
		
		for(int x : secondArray) {
			System.out.println("Talet är: " + x);
			
		}
		
		
	}
}