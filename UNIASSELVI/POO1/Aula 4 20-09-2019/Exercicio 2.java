package Exercicios;

import java.util.Scanner;

public class A2main {
	
	public static void main (String args[]){
		int opcao,val1,val2,total;
		Scanner teclado = new Scanner(System.in);
		
		int senha1,senha2;
		
		System.out.println("Digite uma nova senha: (Apenas numeros)");
		senha1 = teclado.nextInt();
		
		System.out.println("Escolha o primeiro valor:");
		val1 = teclado.nextInt();
		System.out.println("Valor digitado:"+val1);

		System.out.println("Escolha o segundo valor:");
		val2 = teclado.nextInt();
		System.out.println("Valor digitado:"+val2);
		
		System.out.println("Digite sua senha novamente:");
		senha2 = teclado.nextInt();
		
		if(senha1 == senha2){	/*(senha1.equals(senha2)) caso seja uma String */
			total = val1 / val2;
			System.out.println(" A Divis�o �: "+total);
		}

		else{ 	
			System.out.println(" A senha esta errada!");
		}

	}

}
	
	
	
	
