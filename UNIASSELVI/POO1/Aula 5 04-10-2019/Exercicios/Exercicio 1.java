package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantMacas = 0;
		double multiplicacao;

		System.out.print("Digite a quantidade de macas: ");
		quantMacas = input.nextInt();

		if (quantMacas < 12){
			multiplicacao = quantMacas * 1.30; 
		}
		else{
			multiplicacao = quantMacas * 1.00; 
		}

		System.out.print("o valor a ser pago �: R$ " + multiplicacao);
		System.out.println();

	}
	
}



