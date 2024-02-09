package atividades;

import java.util.Scanner;

public class Ativ4 {

	public static void main(String[] args) {
		//Leia quatro valores int (n1, n2, n3, n4). A seguir, calcule e mostre a diferença 
		//do produto entre o n1 e n2 pelo produto entre o n3 e o n4
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3, n4, calculo;
		
		System.out.print("Informe o número 1: ");
		n1= leia.nextInt();
		
		System.out.print("Informe o número 2: ");
		n2= leia.nextInt();
		
		System.out.print("Informe o número 3: ");
		n3= leia.nextInt();
		
		System.out.print("Informe o número 4: ");
		n4= leia.nextInt();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.println("A diferença do produto entre o número 1 e 2 pelo produto entre o número 3 e 4 é: "+calculo);
		
		leia.close();
	}

}
