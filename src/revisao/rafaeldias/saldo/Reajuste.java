package revisao.rafaeldias.saldo;

public class Reajuste {
	
	double saldo = 1386;
	
	public double reajuste() {
		double saldoReajustado = (this.saldo * 0.01) + this.saldo;
		return saldoReajustado;
	}
	
}
