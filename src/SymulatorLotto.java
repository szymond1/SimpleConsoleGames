import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SymulatorLotto {

	public static void main(String[] args) {
		symulator();

	}

	static void symulator() {

		System.out.println("Użytkowniku, dzisiaj zagramy w symulator LOTTO ");

		Scanner scan = new Scanner(System.in);

		// wylosowanie liczb

		Integer[] ticket = new Integer[6];
		int counter1 = 0;
		int number = 0;

		while (counter1 < 6) {
			System.out.println("Podaj kolejną liczbę: ");
			try {
				number = scan.nextInt();
				List<Integer> list = Arrays.asList(ticket);

				if (number < 1 || number > 49) {
					System.out.println("Musisz podać liczbę z zakresu <1,49> ");
				} else if (list.contains(number)) {
					System.out.println("Podałeś już ta liczbę");
				} else {
					ticket[counter1] = number;
					counter1++;
				}

			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba");
				scan.nextLine();
			}
		}

		scan.close();
		// sortowanie liczb

		Arrays.sort(ticket);
		System.out.println(Arrays.toString(ticket));

		// wylosowanie 6 liczb lotto

		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		Collections.shuffle(Arrays.asList(arr));
		Integer[] array = Arrays.copyOf(arr, 6);
		Arrays.sort(array);
		String str = Arrays.toString(array);
		System.out.println("System wylosował następujące liczby: ");
		System.out.println(str);

		// wynik
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < ticket.length; j++) {
				if (array[i].equals(ticket[j])) {
					counter++;

				}
			}
		}

		switch (counter) {
		case (6):
			System.out.println("Wylosowałeś " + counter + "! Jesteś bogaty! ");
			break;
		case (5):
			System.out.println("Wylosowałeś " + counter + "! Brawo! ");
			break;
		case (4):
			System.out.println("Wylosowałeś " + counter + "! :) ");
			break;
		case (3):
			System.out.println("Wylosowałeś " + counter + "! Jest ok! ");
			break;
		default:
			System.out.println("Wylosowałeś " + counter + "! Spróbuj szcześcia znowu ");
			break;

		}

	}
}
