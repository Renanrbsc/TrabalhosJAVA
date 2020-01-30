package CursoDankiCode;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		// ALEM DO IF E ELSE, SWITCH E CASE TBM SERVEM DE CONDIÇOES, FORMA DE TESTAR AS VARIAVEIS
			
		int vida = 30;		
			
		switch(vida){
			case 90:
			//Execute alguma açao aqui!
			System.out.println("Quero que meu personagem corra mais rapido!");
			break;

			case 30:
			System.out.println("Voce precisa se curar!");
			break;

			default:
			System.out.println("Nenhuma das condiçoes foi atingida! Voce tem 100 de vida!");
			break;
		}

	}

}
	