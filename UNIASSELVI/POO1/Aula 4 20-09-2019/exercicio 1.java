package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String args[]){
		int opcao,val1,val2,total;
		Scanner teclado = new Scanner(System.in);
		
		for(int i=1;i>0;i++){
			System.out.println("Escolha o primeiro valor:");
			val1 = teclado.nextInt();
			System.out.println("Valor digitado:"+val1);

			System.out.println("Escolha o segundo valor:");
			val2 = teclado.nextInt();
			System.out.println("Valor digitado:"+val2);
			System.out.println("-----------------------");
			System.out.println("-------Calculos--------");
			System.out.println("-----------------------");

			System.out.println("Digite a Opcao de opera��o Matematica:");
			System.out.println("1 - Soma;");
			System.out.println("2 - Subtra�ao;");
			System.out.println("3 - Divisao;");
			System.out.println("4 - Multiplica�ao;");

			opcao = teclado.nextInt();
					
			switch(opcao){
				case 1:
					total = val1 + val2; 
					System.out.println(" A Soma �: "+total);
					break;
					
				case 2:
					total = val1 - val2;
					System.out.println(" A Subtra��o �: "+total);
					break;
					
				case 3:
					total = val1 / val2;
					System.out.println(" A Divis�o �: "+total);
					break;
					
				case 4:
					total = val1 * val2;
					System.out.println(" A Multiplica��o �: "+total);
					break;
					
				default:
					System.out.println("A opcao escolhida n�o existe!");
					break;	

			}

		}

	}

}
