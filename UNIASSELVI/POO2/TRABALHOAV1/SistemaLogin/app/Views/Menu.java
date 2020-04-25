package SistemaLogin.app.Views;

import java.util.Scanner;

public class Menu {
	private int opcao;
	private Scanner teclado;
	
	public Menu() {
		this.teclado = new Scanner(System.in);
	}
	public String Indice() {
		System.out.println("---------------------------------------------------------------");
		System.out.print("Bem Vindo ao Gioconda, O portal do aluno Uniasselvi! \n");
		return  "1 - Academico " + "\n" +
				"2 - Colaborador " + "\n" +
				"3 - Comunidade " + "\n" +
				"4 - Empresa \n";		 
		}
	
	public int Opcao() {
		System.out.println("-----------------------------------");
		System.out.println("Por favor, escolha um tipo de login:");
		opcao = this.teclado.nextInt();
		System.out.println("-----------------------------------\n");
		
		return opcao;
	}

}




