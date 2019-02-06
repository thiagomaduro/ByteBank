package exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class erroIdadeEmDias {
	Scanner scanner = new Scanner(System.in);
	private int lerDia, lerMes, lerAno;

	private static Calendar calendario = Calendar.getInstance();
	private int dia, mes, ano;

	public int diaAtual() {
		dia = calendario.get(Calendar.DAY_OF_MONTH);

		return dia;

	}

	public int mesAtual() {
		mes = calendario.get(Calendar.MONTH) + 1;

		return mes;
	}

	public int anoAtual() {

		ano = calendario.get(Calendar.YEAR);

		return ano;

	}

	public int idadeDias() {
		System.out.println("Digite o dia que nasceu: ");
		lerDia = scanner.nextInt();

		System.out.println("Digite o mês que nasceu: ");
		lerMes = scanner.nextInt();

		System.out.println("Digite o ano que nasceu: ");
		lerAno = scanner.nextInt();

		System.out.println("O dia que nasceu foi: " + lerDia + " no mês " + lerMes + " de " + lerAno);

		//Calcula Dia
		int idadeDia = diaAtual() - lerDia;
		System.out.println("eu tenho " + idadeDia + " dias");
		
		//Calcula Mês ( VERIFICAR O VALOR NEGATIVO )
		int idadeMes = mesAtual() - lerMes;
		System.out.println("Eu tenho " + idadeMes + "meses de vida!");
		
		//Calcula Ano
		int idadeAno =  anoAtual() - lerAno;

		int resultado = idadeAno * 365;
		System.out.println("tenho em anos: " + idadeAno + " E meu ano em dias é " + resultado);

		return 0;

	}

}
