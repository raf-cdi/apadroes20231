package revisao.rafaeldias.idade;

public class Idade {
	int anos;
	int meses;
	int dias;
	
	public Idade(int anos, int meses, int dias) {
		super();
		this.anos = anos;
		this.meses = meses;
		this.dias = dias;
	}

	public int dias() {
		int resultado = (anos * 365) + (meses * 30) + dias;
		return resultado;
		
	}
	
	
}
