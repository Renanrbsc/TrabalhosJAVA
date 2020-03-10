package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args []) {
		String nome;
		double desc,total,preco;
		int qtd;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome do Produto:\n");
		for(int i = 0; i<=5; i++){
			nome = teclado.next();

			System.out.println("Digite a quantidade do produto:\n");
			qtd = teclado.nextInt();

			System.out.println("Digite o preco do Produto: Obs:(Caso exista centavos coloque '.' inves de ',' Ex: 2.5)\n");
			preco = teclado.nextDouble();

			if (qtd<=10) {
				desc = 0.00;
			} 
			
			else if(qtd<=20) {
				desc = 0.10;
			} 

			else if (qtd<=50) {
				desc = 0.20;
			} 

			else {
				desc = 0.25;
			}

			total = qtd*preco*(1-desc);

			System.out.println("O nome do produto e:\n" +nome);
			System.out.println("O Preco total do Produto: " + total);

		}

	}

}
