package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	//	8 - Escreva um programa para ler um dia, um mês e um ano e informar se a data é válida.
	public static void main (String[]args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o dia escolhido: ");
		int dia = scanner.nextInt();
		
		System.out.println("Digite o mes escolhido: ");
		int mes = scanner.nextInt();
				
		System.out.println("Digite o ano escolhido: ");
		int ano = scanner.nextInt();

		if (dia >= 1 && dia <=30 && mes >= 1 && mes <=12 && ano >=10 && ano <= 99) {
			System.out.println (dia + "/" + mes + "/" + ano + " É uma data válida.");
		}
		else if (dia >= 1 && dia <=30 && mes >= 1 && mes <=12 && ano >=1000 && ano <= 9999) {
			System.out.println (dia + "/" + mes + "/" + ano + " É uma data válida.");
		}
		else {
			System.out.println (dia + "/" + mes + "/" + ano + " Não é uma data válida.");
		}
		
	}

}
