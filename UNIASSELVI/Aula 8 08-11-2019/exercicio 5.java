package Exercicios;
import java.util.Scanner;
public class Codigo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int codigo;

		do {
			System.out.print("Informe o c�digo: ");
			codigo = teclado.nextInt();
			
			System.out.println("C�digo: " + codigo);
		} while (codigo != -1);
		
	}
}
	
//PROGRAMA A � O CORRETO

