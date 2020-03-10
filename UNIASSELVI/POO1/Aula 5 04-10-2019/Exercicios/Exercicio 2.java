package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	   
	public static void main(String args[]) { 
	    Scanner input = new Scanner(System.in); 
	    int numConta; 
	    double saldo, debito, credito, saldoAtual; 
	    
	    System.out.print("Insira o numero da conta: ");
	    numConta = input.nextInt(); 
	    
	    System.out.print("Insira o saldo da conta: "); 
	    saldo = input.nextDouble(); 
	    
	    System.out.print("Insira o valor a ser debitado: "); 
	    debito = input.nextDouble(); 
	    
	    System.out.print("Insira o valor a ser creditado: "); 
	    credito = input.nextDouble(); 
	    
	    saldoAtual = (saldo - debito) + credito;
	    
	    System.out.printf("Conta N�mero : %s \n", numConta); 
	    
	    System.out.printf("\nSaldo Atual = %s \n",saldoAtual); 
	    
	    if ( saldoAtual >= 0 ) { 
			System.out.printf("Saldo Positivo \n"); 
		}

	    else { 
			System.out.printf("Saldo Negativo \n");
		} 
		
	} 

} 

