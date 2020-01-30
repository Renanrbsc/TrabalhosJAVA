package Exercicios;

import java.util.Scanner;

public class Exercicio11 {

	/*Sabendo-se que 100 quilowatts de energia custa 1/7 do salário mínimo(R$ 998,00 - 2019),
	fazer um programa para receber o valor do salário mínimo e a quantidade de
	quilowatts gasta por uma residência e calcular e imprimir:
	- o valor em reais de cada quilowatt
	- o valor em reais a ser pago
	- o novo valor a ser pago por esta residência com um desconto de 10%*/

	public static void main (String[]args) {
		double salMinimo,quantKWresid;
			
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario minimo atual: ");
		salMinimo = teclado.nextDouble();
		
		System.out.println("Digite a quantidade de quiloWatts gasta pela sua Residencia: ");
		quantKWresid = teclado.nextDouble();
		
		double valueKWenergy = (salMinimo/7)/100; 
		double valueofResid = valueKWenergy * quantKWresid;
		double descinResid = (valueofResid*10)/100;
		double totalValueResid = valueofResid - descinResid;
		
		System.out.println("O valor de cada quiloWatts: -> "+valueKWenergy);
		System.out.println("O valor em Reais a ser Pago: -> "+valueofResid);
		System.out.println("Desconto de 10%: -> "+descinResid);
		System.out.println("Novo valor em Reais com desconto de 10%: -> "+totalValueResid);

	}
	
}
