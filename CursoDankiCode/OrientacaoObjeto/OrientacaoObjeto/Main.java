package OrientacaoObjeto;

/* Para implementar uma interface add* implements NomeInterface * em class desejada */
public class Main implements PlayerInterface {

	public static void main (String[] args) {
		
		Player player = new Player();
		player.IniciarPlayer();
		
		Inimigo inimigo = new Inimigo();
		inimigo.IniciarInimigo();
	}

	@Override
	public void Iniciar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GanharVida() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PerderVida() {
		// TODO Auto-generated method stub
		
	}
	
}
