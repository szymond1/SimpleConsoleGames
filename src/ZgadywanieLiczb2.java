import java.util.Scanner;

public class ZgadywanieLiczb2 {

	public static void main(String[] args) {
		symulator();

	}

	public static void symulator() {

		System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją zgadnę w max. 10 próbach.");
		System.out.println("Po podaniu przeze mnie liczby, napisz: \"za mało\", \"za dużo\" lub \"zgadłeś\" ");
		System.out.println("Nie oszukuj :)");
		
		Scanner scan = new Scanner(System.in);
		String result = "";
		int min = 0;
		int max = 1000;
		int counter =0;

		while (!result.equals("zgadłeś")) {
			
			int guess = ((max - min) / 2) + min;
			System.out.println("Zgaduję: " + guess);
			result = scan.nextLine();
			if (counter >10) {
				System.out.println("Oszukujesz kolego!");
				break;
			}
				if (result.equals("za mało") || result.equals("za malo")) {
				min = guess;
				} else if (result.equals("za dużo") || result.equals("za duzo") ) {
					max = guess;
				} else if (result.equals("zgadłeś") || result.equals("zgadles") ){
					System.out.println("Wygrałem!");
					counter++;
					System.out.println("Pokonałem Cię w " + counter + " ruchach");
					
				} else {
					System.out.println("Niepoprawna instrukcja");
				}
				counter++;
			
		}
			scan.close();
	}

}
