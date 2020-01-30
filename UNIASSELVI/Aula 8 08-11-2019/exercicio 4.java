package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args []) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("digite um numero:");
		int numero = teclado.nextInt();

		String converString = Integer.toString(numero);

		System.out.println(converString.length());

	}  
	                      
}

	
