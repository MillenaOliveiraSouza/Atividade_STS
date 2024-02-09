package atividades;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		// o codigo irá exibir a media do aluno
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite o nome do aluno/a: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a 1° nota: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a 2° nota: ");
		nota2= leia.nextFloat();
		System.out.println("Digite a 3° nota: ");
		nota3= leia.nextFloat();
		System.out.println("Digite a 4° nota");
		nota4 = leia.nextFloat();
		
		media= (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("A media do aluno/a %s é %.2f", nome,media);
		
		leia.close();
		
	}

}
