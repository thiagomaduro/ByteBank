package exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class calculaIdadeEmDias {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dateBeforeString = "";
		String dateAfterString = "";

		System.out.println("Digite sua data que nasceu: (yyyy-mm-dd) ");
		dateBeforeString = scanner.nextLine();

		System.out.println("Digite a data atual: (yyyy-mm-dd)");
		dateAfterString = scanner.nextLine();

		// Analisando a data
		LocalDate dateBefore = LocalDate.parse(dateBeforeString);
		LocalDate dateAfter = LocalDate.parse(dateAfterString);

		// calculando o numero de dias em
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

		System.out.println(noOfDaysBetween);

		scanner.close();
	}
}