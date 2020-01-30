package Default
;
import java.util.Random;
import java.util.Scanner;
public class ProgramaLeitura2 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		String nome,comando,w,a,d,s;
		
		Random rand = new Random();
		System.out.println("Seja bem-vindo ao Jogo! Insira seu Nome:");
		nome = in.nextLine();
		System.out.println("Seja muito bem-vindo(a)"+nome);
		System.out.println("Voce deseja avanca para qual direcao??(w,s,a,d)");
		comando = in.nextLine();				
		if(comando.equals("w")); {
			System.out.println("Voce avancou para frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer?(a=atacar,c=correr)");
			comando = in.nextLine();
			
			switch(comando)	{
			case "a":
				if(rand.nextInt(100)<50){
					System.out.println("Voce atacou ele!");
					System.out.println("Porem, se defendeu!(a=atk novamente,c=correr)");
				}

				else{
					System.out.println("Que Pena! Ele te derrotou!");
				}
				
			}

		}

	}

}
			
	/*a	
					comando = in.nextLine();
					if(comando.equals("a"));{
					if(rand.nextInt(100)<75) {System.out.println("Parabens! Seu inimigo foi derrotado!");}
					else {System.out.println("Que Pena! Ele te derrotou!");}}
		}else {System.out.println("Voce correu! mas Cuidado!");
			if(rand.nextInt(100)<50) {System.out.println("Hoo Não! ele te alcancou! O que deseja fazer? (a=atacar, c=Implorar)");
			comando = in.nextLine();
			if(comando.equals("a"));{System.out.println("Parabens! apesar de cansado(a) voce derrotou ele!");}
			}else {System.out.println("Voce implorou e seu inimigo foi embora! Parabens!");}}*/
	
		
		
		
		
		
	
			
		
		
	
		
		
		
		
		
		
		
		
		
	
