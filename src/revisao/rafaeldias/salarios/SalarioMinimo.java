package revisao.rafaeldias.salarios;

public class SalarioMinimo {
	
	double salarioMinimo = 1320.00;
	double salario;
	
	public double qtdSalarios() {
		return this.salario / this.salarioMinimo;
	}

	public SalarioMinimo(double salario) {
		super();
		this.salario = salario;
	}
	
	
}
