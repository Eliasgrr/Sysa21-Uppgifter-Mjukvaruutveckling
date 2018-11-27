import java.util.Scanner;


public class Uppgift2_2 {

	public static void main(String[] args) {

		
		Scanner stdIn = new Scanner(System.in);
		
		String name;
		int length;
		
		System.out.print("Skriv in ett namn: ");
		name = stdIn.nextLine();

		
		length = name.length();
	
		System.out.println(name + " det är " + length + " tecken i namnet");
		
	}

}
