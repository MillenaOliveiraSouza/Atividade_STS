package atividades;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
	//Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, 
	//as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e 
	//exiba na tela o Salário Líquido
		
		Scanner leia = new Scanner(System.in);
		
		double salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		
		System.out.print("Informe o seu salário bruto: R$ ");
		salarioBruto= leia.nextDouble();
		System.out.print("Informe o adicional noturno: R$ ");
		adicionalNoturno= leia.nextDouble();
		System.out.print("Informe o valor das horas extras: R$ ");
		horasExtras= leia.nextDouble();
		System.out.print("Informe os descontos: R$ ");
		descontos= leia.nextDouble();
		salarioLiquido= salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		System.out.printf("O Seu salario liquido é de: R$ %.2f",salarioLiquido);
		
		leia.close();
	}

}
