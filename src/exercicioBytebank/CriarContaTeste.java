package exercicioBytebank;

public class CriarContaTeste {

	public static void main(String[] args) {

		ContaTeste primeiraConta = new ContaTeste();
		primeiraConta.saldo = 0;
		primeiraConta.deposita(20);
		// 0,00 de saldo + 20,00 depositados!
		System.out.println("Seu saldo atual é de: " + primeiraConta.saldo);

		primeiraConta.saca(10);
		System.out.println("Seu saldo atual da primeira conta depois de sacar é de: " + primeiraConta.saldo);
		
		ContaTeste segundaConta = new ContaTeste();
		segundaConta.saldo = 0;
		segundaConta.deposita(500);
		System.out.println("O saldo atual da segunda conta é de: " + segundaConta.saldo);
		
		segundaConta.transfere(200, primeiraConta);
		
		System.out.printf("Primeira Conta agora tem %.2f e segunda conta tem %.2f ", primeiraConta.saldo, segundaConta.saldo);
	}
}
