package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[]args) {
		int n1,n2,n3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira prova!");
		n1 = scanner.nextInt();
		
		System.out.println("Digite a segunda prova!");
		n2 = scanner.nextInt();
		
		System.out.println("Digite a terceira prova!");
		n3 = scanner.nextInt();
		
		if (n1 > n2 && n1 > n3){System.out.println("Maior nota é:"+n1); 
								System.out.println("Primeira nota digitada!");
		}
	
		else if (n2 > n1 && n2 > n3){System.out.println("Maior nota é:"+n2); 
										System.out.println("Segunda nota digitada!");
		}
	
		else if (n3 > n1 && n3 > n2){System.out.println("Maior nota é:"+n3); 
										System.out.println("Terceira nota digitada!");
		}
	
		else {System.out.println("Maior nota contem valor repetido!");
		}
		
		if (n1 < n2 && n1 < n3){System.out.println("Menor nota é:"+n1); 
								System.out.println("Primeira nota digitada!");
		}

		else if (n2 < n1 && n2 < n3){System.out.println("Menor nota é:"+n2); 
										System.out.println("Segunda nota digitada!");
		}

		else if (n3 < n1 && n3 < n2){System.out.println("Menor nota é:"+n3); 
										System.out.println("Terceira nota digitada!");
		}

		else {System.out.println("Menor nota contem valor repetido!");
		}

	}

}
	
	
	

