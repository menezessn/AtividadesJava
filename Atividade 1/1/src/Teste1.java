import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		
		Scanner grava= new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		String nome;
		
		System.out.println("Escreva seu nome e as notas do primeiro, segundo e terceiro bimestre.");
		
		System.out.println("Digite seu nome:");
		nome = grava.next();
		
		System.out.println("Digite a nota do primeiro bimestre:");
		nota1 = grava.nextFloat();
		
		System.out.println("Digite a nota do segundo bimestre:");
		nota2 = grava.nextFloat();
		
		System.out.println("Digite a nota do terceiro bimestre:");
		nota3 = grava.nextFloat();
		
		media=(nota1+nota2+nota3)/3;
		
		System.out.println("A média do aluno "  + nome + " é " + media);
		
		
		
		
		

	}

}
