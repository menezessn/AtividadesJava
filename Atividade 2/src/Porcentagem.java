import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		
		Scanner grava = new Scanner(System.in);
		
		double valor, porcentagem;
		
		System.out.println("Escreva algum valor:");
		valor = grava.nextDouble();
		
		porcentagem = 0.1 * valor;
		
		System.out.println("10% de "+ valor + " é " + porcentagem);
		
		
		
		
		

	}

}
