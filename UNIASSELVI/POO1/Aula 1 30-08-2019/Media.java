package Default;

import javax.swing.JOptionPane;

public class Media {
	
	public static void main(String[] args) {
		
		  	String PrimeiroNumero; // 1° string informado pedo usuario
	        String segundoNumero;  // 2° string informado pedo usuario
	        int numero1;  //primeiro operando da adicao
	        int numero2;  //segundo operando da adicao
	        int media;	//resultado da adicao
	        //Ler o primeiro numero (na forma String)
	        PrimeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro numero de sua escolha!" );
	        //Ler o Segundo numero (na forma String)
	        segundoNumero = JOptionPane.showInputDialog("Digite o Segundo numero de sua escolha!" );
	        //convertendo os Strings em numeros inteiros
	        numero1 = Integer.parseInt(PrimeiroNumero);
	        numero2 = Integer.parseInt(segundoNumero);
	        //Somando os numeros e dividindo para obter Media
	        media = (numero1 + numero2)/2;
	        //Apresentando os resultados
	        JOptionPane.showMessageDialog(null, "A media foi: "+media, "Resultado da Soma: ",
	                JOptionPane.PLAIN_MESSAGE);
	                System.exit(0);
		
		
		
	}

}
