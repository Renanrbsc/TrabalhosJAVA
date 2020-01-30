package CursoDankiCode;

public class OperacaoMatematica {

	public static void main (String[]args) {
		
		// LOGICA MATEMATICA E SEUS OPERADORES!
		
		int vida_1 = 100;
		int vida_2 = 50;
		int vida_3 = 200;
						
		System.out.println("Soma das 3 variaveis: "+(vida_1 + vida_2 + vida_3));
				
				
		int vida_final = vida_1 + vida_2 + vida_3;		
		
		System.out.println("Variavel com valores ja somados: "+vida_final);
				
				
		int final_2 = (vida_2 + vida_1) /2;
		
		System.out.println("Logica matematica, Soma entre parenteses e depois divisao: "+final_2);
		
		int final_3 = ((vida_1+vida_3)*8)/5;
				
		System.out.println("Logica matematica,Resolve os parenteses e depois usa a variavel: "+final_3);
		
		
		// &&(e) e ||(ou) usadas para criar escolha nas condicoes!
		
		String nome_jogador = "Renan";
		int skill = 100;
		
		if (nome_jogador == "Renan" && skill == 100);{
			System.out.println("As duas condiçoes sao verdade!");
		}
			
		if ((nome_jogador == "Renan" || nome_jogador == "Bruno") && skill <= 50){
			System.out.println("Condiçao com (ou) e (e) sao verdades!");
		}
			
		if ((nome_jogador == "Renan" || nome_jogador == "Bruno") && skill == 100 || skill >= 80){
			System.out.println("as Condicoes de (ou) e (e) sao verdades em ambas posiçoes!");
		}

	}
	
}

