package Default;
import javax.swing.JOptionPane;
public class SwitchCase {

	public static void main(String[] args) {
			
					
		int notaProva = 0, notaTrab = 0, notaProj = 0;
		float MediaFinal = 0;
		String esc;
		int escolha = 1;
		
		while ((escolha >=1)&&(escolha <=4)){
		
		esc = JOptionPane.showInputDialog("Digite sua Escolha" );
		escolha = Integer.parseInt(esc);
		
		switch(escolha)	{
		
			case 1: notaProva = Integer.parseInt(JOptionPane.showInputDialog("Nota da Prova:" ));
			
			
			case 2: notaTrab = Integer.parseInt(JOptionPane.showInputDialog("Nota da Trabalho:" ));
			
			
			case 3: notaProj = Integer.parseInt(JOptionPane.showInputDialog("Nota da Projeto:" ));
			
			
			default: if (escolha<4) MediaFinal = (notaProva + notaTrab + notaProj)/(3-escolha+1);
			
			}

			JOptionPane.showMessageDialog(null,"Media Final: "+MediaFinal,"Resultados",
			JOptionPane.INFORMATION_MESSAGE);

			MediaFinal = notaProva = notaTrab = notaProj = 0;

		}
		
		System.exit(0);
			
	}

}
