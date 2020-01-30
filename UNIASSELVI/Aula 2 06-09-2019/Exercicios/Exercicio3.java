package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
		
	public static void main(String[] args){
		int n1,n2,n3;
		int nota;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota primeira prova");
		n1 = scanner.nextInt();
		
		System.out.println("Digite a nota segunda prova");
		n2 = scanner.nextInt();
		
		System.out.println("Digite a nota terceira prova");
		n3 = scanner.nextInt();
		
		nota = (n1 + n2 + n3)/3;
		
		if (nota < 4){	System.out.println("reprovado! -> "+nota);}
		else if (nota >6){	System.out.println("Aprovado! -> "+nota);}
		else {	System.out.println("Exame! -> "+nota);}

	}

}