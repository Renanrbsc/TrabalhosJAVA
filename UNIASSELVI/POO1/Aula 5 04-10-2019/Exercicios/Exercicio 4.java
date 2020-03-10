package Exercicios;

import java.util.Scanner;
	
public class Exercicio4 {

	public static void main(String args[]) {
	    Scanner input = new Scanner(System.in); 
	    int codigo, senha; 
	    input = new Scanner(System.in); 
	     
	    System.out.print("Digite o c�digo do usu�rio: \n");
	    codigo = input.nextInt(); 
	    
	    if (codigo != 1234){ 
	        System.out.println("Usu�rio inv�lido \n"); 
		}
		
	    else {
			System.out.println("Digite a Senha: "); 
			senha = input.nextInt();
			
			if (senha != 9999){ 
				System.out.println("Senha incorreta! \n"); 
	 	    }
	 	    else {
	 	        System.out.println("Acesso Permitido! "); 
	 	        System.out.println(" "); 
	 	        System.out.println("Dados da NASA ");
	 	        System.out.println("Projeto Genos ");
	 	        System.out.println(".....................................");
	 	        System.out.println("Erro!  ");
	 	        System.out.println("Viola��o de acesso! Intruso!  ");
	 	    } 
	         
	    }
	   	       
	}
	
}

	
	