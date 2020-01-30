package ExercicioMetodos;
/*extends -> usado para extender metodos de outras classes*/
public class Main extends Protected{

	/* Metodo Construtor -> Metodo que vai inicializar automaticamente ao chamar a class! */
	public Main() {
		System.out.println("Metodo Automatico");
	}
	public static void main (String[]args) {
		
		/* Metodo Construtor*/
		new Main();
				
		Player player = new Player();
		player.Publico();
		
		/* teste onde o Metodo esta acessivel apenas na class Private */ 
	/*	Private testeMetodo = new Private();
		testeMetodo.Privado();
	*/
		
		Protected testeProtected = new Protected();
		testeProtected.Exclusivo();
		
		/* usado para chamar metodo */
		new Main().Privado();
		
	}
	/* Metodo private acessivel na propria classe */
	private void Privado(){
		System.out.println("Private -> Apenas acessivel na classe Atual!");
	}
	
}
