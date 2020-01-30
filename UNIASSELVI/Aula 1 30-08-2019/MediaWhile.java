package Default;

import javax.swing.JOptionPane;

public class MediaWhile {
	
	public static void main (String[] args) {

		int total,
			contadorNota,
			valorNota,
			media;
		String Nota;
		
		total = 0;
		contadorNota = 1;
		while (contadorNota <= 10){
			
			Nota = JOptionPane.showInputDialog("Entre com a nota - valor inteiro" );
			
			valorNota = Integer.parseInt(Nota);
			total += valorNota;
			contadorNota++;
		}
		media = total/10;
		
		JOptionPane.showMessageDialog (null, "\nMedia da turma �: "+media, "Media Turma! ",
		JOptionPane.PLAIN_MESSAGE);
			
		System.exit(0);		
								
		}
					
}
