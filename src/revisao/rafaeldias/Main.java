package revisao.rafaeldias;

import revisao.rafaeldias.idade.Idade;
import revisao.rafaeldias.imposto.CalcImposto;
import revisao.rafaeldias.media.MediaAritmetica;
import revisao.rafaeldias.numeros.Numero;
import revisao.rafaeldias.salarios.SalarioMinimo;
import revisao.rafaeldias.saldo.Reajuste;

public class Main {
	public static void main(String[] args) {
		
		// Questão 1 --->
		
		Idade idade1 = new Idade(10, 3, 15);
		System.out.printf("Questão 1: A quantidade de dias dessa idade é %d. \n", idade1.dias());
		
		// Questão 2 --->
		
		MediaAritmetica media = new MediaAritmetica();
		System.out.printf("Questão 2: A média é de: %.1f. \n" , media.somaMedia());
		
		// Questão 3 --->
		
		Reajuste reajuste = new Reajuste();
		System.out.printf("Questão 3: O saldo rejustado é de: R$ %.2f. \n", reajuste.reajuste());
		
		// Questão 4 --->
		
		CalcImposto calculo1 = new CalcImposto(5, 6610, 36.90, 3, 6611, 49.90, 5);
		System.out.printf("Questão 4: Total a ser pago: R$ %.2f. \n", calculo1.calculo());
		
		//Questão 5 --->
		
		SalarioMinimo salario = new SalarioMinimo(2000);
		System.out.printf("Questão 5: Você recebe: %.2f salários mínimos. \n", salario.qtdSalarios());
		
		//Questão 6 --->
		
		Numero numero = new Numero(8);
		System.out.printf("Questão 6: O número antecessor é %d e o número sucessor é %d.", numero.antecessor(), numero.sucessor());
		
		
		
	}
}
