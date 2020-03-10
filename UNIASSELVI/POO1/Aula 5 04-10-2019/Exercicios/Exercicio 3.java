package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
		
	public static void main(String args[]) { 
	    Scanner input = new Scanner(System.in); 
	    int golstime1, golstime2; 
	    String nometime1, nometime2; 
	    
	    System.out.println("Digite o nome do time 1: ");
	    nometime1 = input.next(); 
	    
	    System.out.printf("Digite o numero de gols feitos (time 1) \n"); 
	    golstime1 = input.nextInt(); 
	    
	    System.out.println("Digite o nome do time 2: ");
	    nometime2 = input.next(); 
	    
	    System.out.printf("Digite o numero de gols feitos (time 2) \n"); 
	    golstime2 = input.nextInt(); 
	    
	    if ( golstime1 > golstime2 ){ 
	        System.out.println("Ganhou \n"+nometime1); 
		}
		
	    else if ( golstime1 == golstime2 ){
			System.out.println("Empate"); 
		}  

	    else {
	        System.out.println("Ganhou \n"+nometime2);
		} 
		
	} 

} 

