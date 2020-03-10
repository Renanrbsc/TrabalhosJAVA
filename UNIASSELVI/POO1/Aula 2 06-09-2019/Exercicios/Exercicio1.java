package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main (String[]args){
		
		System.out.println("Escolha uma opçao!");
		System.out.println("1 - Solteiro(a)");
		System.out.println("2 - Desquitado(a)");
		System.out.println("3 - Casado(a)");
		System.out.println("4 - Divorciado(a)");
		System.out.println("5 - Viuva(a)");
		
		int numOpcao;
				
		String [] opcao = new String[6]; // vetores comecam apartir do ZERO 0,1,2,3,4,5,6
		opcao[1] = "Solteiro(a)";
		opcao[2] = "Desquitado(a)";
		opcao[3] = "Casado(a)";
		opcao[4] = "Divorciado(a)";
		opcao[5] = "Viuva(a)";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a opcao!");
		numOpcao = scanner.nextInt();
		
		if(numOpcao == 1) {System.out.println(opcao[1]);}
		else if (numOpcao == 2) {System.out.println(opcao[2]);}
		else if (numOpcao == 3) {System.out.println(opcao[3]);}
		else if (numOpcao == 4) {System.out.println(opcao[4]);}
		else if (numOpcao == 5) {System.out.println(opcao[5]);}
		else if (numOpcao == 0) {System.out.println("Opcao inexistente!");}
		else {System.out.println("Opcao inexistente!");}
		
		/* // Forma sem Array/Vetor 
		
		if (numOpcao == opcao[1]){ System.out.println("Sua opcao é: 1 - Solteiro(a) ");}
		else if (numOpcao == opcao[2]){ System.out.println("Sua opcao é: 2 - Desquitado(a)");}
		
		else if (numOpcao == opcao[3]){ System.out.println("Sua opcao é: 3 - Casado(a) ");}
		
		else if (numOpcao == opcao[4]){ System.out.println("Sua opcao é: 4 - Divorciado(a) ");}
		
		else if (numOpcao == opcao[5]){ System.out.println("Sua opcao é: 5 - Viuva(a) ");}
		
		else {System.out.println("Opcao inexistente!");}

		*/
		
	}
	
}


