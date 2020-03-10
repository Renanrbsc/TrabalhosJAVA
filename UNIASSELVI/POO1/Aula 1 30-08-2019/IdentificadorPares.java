package Default;

import javax.swing.JOptionPane;

public class MediaWhile {
	
	public static void main (String[] args) {

		String numeroInformado, saidaFinal = "";
		int numero,
			contador = 0,
			pares = 0;
						
		numeroInformado = JOptionPane.showInputDialog("Entre com a nota - valor inteiro" );
		numero = Integer.parseInt(numeroInformado);
		do {
			if ((contador % 2)!=0)
				continue;
			pares++;
			saidaFinal += contador + "";
			}
			
					while (++contador<numero);
		saidaFinal+= "\nTotal de Pares: " + pares;
		
		
						
						JOptionPane.showMessageDialog(null,saidaFinal);
						
					        System.exit(0);
			}
			
		
}
