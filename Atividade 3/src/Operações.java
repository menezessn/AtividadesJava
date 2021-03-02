import java.util.Scanner;

public class Operações {

	public static void main(String[] args) {
		
	double valor1, valor2, soma, subtracao, divisao, multiplicacao;
		
	Scanner grava = new Scanner(System.in);

	System.out.println("Digite um valor:");
	valor1=grava.nextDouble();
	System.out.println("Digite outro valor:");
	valor2=grava.nextDouble();
	
	soma=valor1+valor2;
	subtracao = valor1-valor2;
	divisao=valor1/valor2;
	multiplicacao = valor1*valor2;
	
	System.out.println("Operações do primeiro pelo segundo:");
	System.out.println("\nResultado da subtração dos valores:"+ subtracao);
	System.out.println("\nResultado da multiplicação dos valores:"+ multiplicacao);
	System.out.println("\nResultado da soma dos valores:"+ soma);
	System.out.println("\nResultado da divisão dos valores:"+ divisao);
	
	
	}

}
