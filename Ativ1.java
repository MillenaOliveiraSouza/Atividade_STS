package atividades;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) { 
		// o usuário devera colocar os valores do salario e abono e o código ira informar o novo salario.
		
		Scanner read = new Scanner(System.in);
		
		double salario, abono, novoSalario;
		
		System.out.print("Informe o seu salario: R$ ");
		salario= read.nextDouble();
		
		System.out.print("Informe o abono: R$ ");
		abono= read.nextDouble();
		
		novoSalario= abono+salario;
		System.out.printf("Seu novo salario é: R$ %.2f",novoSalario);
		
		read.close();
	}

}
