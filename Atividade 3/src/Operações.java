import java.util.Scanner;

public class Opera��es {

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
	
	System.out.println("Opera��es do primeiro pelo segundo:");
	System.out.println("\nResultado da subtra��o dos valores:"+ subtracao);
	System.out.println("\nResultado da multiplica��o dos valores:"+ multiplicacao);
	System.out.println("\nResultado da soma dos valores:"+ soma);
	System.out.println("\nResultado da divis�o dos valores:"+ divisao);
	
	
	}

}
