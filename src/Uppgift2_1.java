import java.util.Scanner;

public class Uppgift2_1 {

	public static void main(String[] args) {
		
		
		String fornamn;
		String efternamn;
		
		Scanner stdIn = new Scanner(System.in);
		
		fornamn = stdIn.nextLine();
		System.out.println("Skriv in ett namn: " + fornamn);
		
		efternamn = stdIn.nextLine();
		System.out.println("Skriv in ett efternamn: " + efternamn);
		
		System.out.println(fornamn + " , " + efternamn);
		stdIn.close();

	}
}
