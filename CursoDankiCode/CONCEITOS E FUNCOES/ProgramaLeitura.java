package CursoDankiCode;

import java.util.Scanner; // Funcao de Digitacao

public class ProgramaLeitura {
	
	public static void main (String[]args) {

		// Import de Funçao para campo de digitaçao!
		
	/*  Scanner in = new Scanner (System.in);
		String nome = in.nextLine();
		
		System.out.println("Nome existente na variavel atual: "+nome);*/
	
		
		// Teste com variaveis para digitacao!
		// if e else para testar a funcionalidade das variaveis
		Scanner in = new Scanner (System.in);
		
		String nome,idade,peso,cidade,estado,país;
		
		System.out.println("Por favor digite o seu nome:");
		nome = in.nextLine();
		if (nome.equals("Renan")) {
			System.out.println("Olá! Bem Vindo novamente!"); 
		}
		else { 
			System.out.println("Olá! Novo Usuario!"); 
		}

		System.out.println("Por favor digite o seu idade:");
		idade = in.nextLine();
		System.out.println("Por favor digite o seu peso:");
		peso = in.nextLine();
		System.out.println("Por favor digite o seu cidade:");
		cidade = in.nextLine();

		if (cidade.equals("Blumenau")) {
		System.out.println("Show! Tambem sou de Blumenau!"); 
		}

		else { 
			System.out.println("Que Pena! Voce nao é de Blumenau!"); 
		}

		System.out.println("Por favor digite o seu estado:");
		estado = in.nextLine();
		System.out.println("Por favor digite o seu país:");
		país = in.nextLine();

		if (país.equals("Brasil")) {
			System.out.println("Que legal, Somos dois agora!"); 
		}

		else { 
			System.out.println("Que pena, é um Estrangeiro!"); 
		}
		
		//Gerar resultados do seu teste!
		System.out.println("Aqui está o resultado do seu teste:");
		System.out.println("----------------------------------");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Cidade: "+cidade);
		System.out.println("Estado: "+estado);
		System.out.println("País: "+país);

	}

}
