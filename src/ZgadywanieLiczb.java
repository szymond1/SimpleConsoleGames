import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ZgadywanieLiczb {

	public static void main(String[] args) {
		guessNumber();

	}

	static void guessNumber() {

		Random r = new Random();
		int number = r.nextInt(100) + 1;
		int guess = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lets play a game...");
		

	
		while (number !=guess) {
			System.out.println("Użytkowniku, podaj liczbę ");
			try {
				guess = scan.nextInt();

				if (guess < number) {
					System.out.println("Za mało");
					continue;
				} else if ( guess > number) {
					System.out.println("Za dużo");
					continue;
				} else {
					System.out.println("Brawo, zgadłeś!");
					scan.close();
					return;
				}
			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba");
				scan.nextLine();
			}
		
	
		}		
		
	}

}
