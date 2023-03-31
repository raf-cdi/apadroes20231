package revisao.rafaeldias.imposto;

public class CalcImposto {
	
	double ipi;
	
	// Peça 1
	
	int cod1;
	double valor1;
	int qtd1;
	
	// Peça 2
	
	int cod2;
	double valor2;
	int qtd2;
	
	// calculo
	
	public double calculo() {
		double resultado = (valor1 * qtd1 + valor2 * qtd2) * (ipi/100 + 1);
		return resultado;
		
	}

	public CalcImposto(double ipi, int cod1, double valor1, int qtd1, int cod2, double valor2, int qtd2) {
		super();
		this.ipi = ipi;
		this.cod1 = cod1;
		this.valor1 = valor1;
		this.qtd1 = qtd1;
		this.cod2 = cod2;
		this.valor2 = valor2;
		this.qtd2 = qtd2;
	}
	
	
}
