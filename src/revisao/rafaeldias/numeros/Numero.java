package revisao.rafaeldias.numeros;

public class Numero {
	
	int numero;
	
	
	public int antecessor() {
		int antecessor = this.numero - 1;
		return antecessor;
	}
	
	public int sucessor() {
		int sucessor = this.numero + 1;
		return sucessor;
	}

	public Numero(int numero) {
		super();
		this.numero = numero;
	}
	
}
