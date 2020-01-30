package Exercicios;

import java.util.Scanner;

public class A3main {

	public static void main (String args[]){
		double total = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("quantos funcionarios a empresa tem:");
		int t = teclado.nextInt();
		
		for(int i=0;i<t;i++){
			System.out.println("Nome do funcionario:");
			String nome = teclado.next();
			
			System.out.println("Salario do funcionario: "+nome);
			double sal = teclado.nextDouble();
		
			total = sal + total;
		}
		
		System.out.println("Soma de todos os salarios: "+total);
		double media = total/t;
		
		System.out.println("Media dos salarios da empresa: "+media);
		
	}
	
}
