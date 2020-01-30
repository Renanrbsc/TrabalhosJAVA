package CursoDankiCode;
import java.util.Random;
import java.util.Scanner;
public class JogodePalavra {

	public static void main (String[]args) {
			
		Scanner in = new Scanner (System.in);
		String nome,comando;
		Random rand = new Random();
		System.out.println("Seja bem-vindo ao Jogo! Insira seu Nome:");
		nome = in.nextLine();
		System.out.println("Seja muito bem-vindo(a)"+nome);
		System.out.println("Voce deseja avanca para qual direcao??(w,s)");
		comando = in.nextLine();
			
		if(comando.equals("w")); {
			System.out.println("Voce avancou para frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer?(a=atacar,c=correr)");
			comando = in.nextLine();
			if(comando.equals("a")); {
					System.out.println("Voce atacou ele!\nPorem, se defendeu!(a=atk novamente,d=desviar)");
					comando = in.nextLine();
					if(comando.equals("a"));{
						if(rand.nextInt(100)<=50) {
							System.out.println("Parabens! Seu inimigo foi derrotado!");
						}

						else {
							System.out.println("Que Pena! Ele te derrotou!");
						}
					}

					if(comando.equals("d")); {
						System.out.println("Uau, sua esquiva funcionou! mas e agora?(a=atacar,c=correr)");
					}

			}
					
			if (comando.equals("c")) {
				if(rand.nextInt(100)<=50){
					System.out.println("Hoo Não! ele te alcancou! O que deseja fazer? (a=atacar, c=Implorar)");
					comando = in.nextLine();
					if(comando.equals("a"));{
						System.out.println("Parabens! apesar de cansado(a) voce derrotou ele!");
					}

					if (comando.equals("c")) {
						System.out.println("Voce implorou e seu inimigo foi embora! Parabens!");
					}
					
				}
				else {
					System.out.println("Parabens! voce fugiu dele!");
				}

			}
			
		}

	}

}
	

