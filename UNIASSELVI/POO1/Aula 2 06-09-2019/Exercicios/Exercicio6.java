package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main (String[]args) {
		String aluno;
		int matricula;
		int nota,n1,n2,n3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Nome do aluno:");
		aluno = scanner.next();
		
		System.out.println("Digite a Matricula:");
		matricula = scanner.nextInt();
		
		System.out.println("Digite a nota primeira prova");
		n1 = scanner.nextInt();
		
		System.out.println("Digite a nota segunda prova");
		n2 = scanner.nextInt();
		
		System.out.println("Digite a nota terceira prova");
		n3 = scanner.nextInt();
		
		nota = (n1 + n2 + n3)/3;
		
		System.out.println(":::::::Dados do Aluno:::::::");
		System.out.println("Nome: "+aluno);
		System.out.println("Matricula: "+matricula);
		
		if (nota < 4){System.out.println("Status: Reprovado! -> "+nota);
		}
		else if (nota >6){	System.out.println("Status: Aprovado! -> "+nota);
		}
		else {	System.out.println("Status: Em Exame! -> "+nota);
		}
		
	}
	
}
