package Default;
import javax.swing.JOptionPane; 

public class doisNumero {

    public static void main(String[] args) {
        String PrimeiroNumero;
        String segundoNumero;
        int numero1;
        int numero2;
        int soma;
        
        PrimeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro numero de sua escolha!" );
        segundoNumero = JOptionPane.showInputDialog("Digite o Segundo numero de sua escolha!" );
    
        numero1 = Integer.parseInt(PrimeiroNumero);
        numero2 = Integer.parseInt(segundoNumero);
                
        soma = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "A soma foi: "+soma, "Resultado da Soma: ",
        JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        
    }
    
}

