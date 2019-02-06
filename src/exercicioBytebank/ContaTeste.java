package exercicioBytebank;

public class ContaTeste {
	double saldo;
	int agencia;
	double numero;
	String titular;

	public void deposita(double valor) {
		saldo += valor;
		return;
	}

	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else
			return false;

	}
	
	public boolean transfere(double valor, ContaTeste destino){
		if(valor <= this.saldo) {
			this.saldo -= valor;
			//Destino, deposita(usando meu outro método) esse VALOR;
			destino.deposita(valor);
			return true;
			}
			return false;
	}
}
