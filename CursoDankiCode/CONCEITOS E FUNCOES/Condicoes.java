package CursoDankiCode;

public class Condicoes {

	public static void main (String[]args) {
		
		/* WHILE REPETIÇAO EM CONDIÇAO IF */
		
		int vida = 50;
		
		while (vida < 100) {
		vida++;
		System.out.println("Minha vida ganhou 1 ponto! ");
		System.out.println(" Pontos de vida: "+vida);
		
		}

		if (vida >= 100){
			System.out.println("Minha vida está em 100!");	
		}	
		
		/* IF E ELSE IF EM UMA STRING*/
		
		String nome;
						
		nome = "Renan";
		nome = "Giulia";
		
		if (nome == "Renan") {System.out.println( "Ola Renan, Seja bem vindo! ");}
		
		else if (nome == "Giulia") {System.out.println( "Ola Giulia, Seja bem vindo! ");}    
		
		/* CONDIÇAO IF E ELSE IF EM BOOLEAN DE VERDADEIRO E FALSO*/
				
		boolean var = false;
		
		if(var)  {
			System.out.println( "É verdadeiro! ");
		}
		
		else if (var != true) {
			System.out.println( "É falso! ");
		} 
			
	}

}

