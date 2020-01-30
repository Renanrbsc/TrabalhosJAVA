package Default;

import javax.swing.JOptionPane;

public class Comparacao {

    public static void main(String[] args) {
        String PrimeiroNumero; // 1 string informado pelo usuario
        String segundoNumero; // 2 string informado pelo usuario
        int numero1; // primeiro numero da comparaçao
        int numero2; // segundo numero da comparaçao
        String resultado = ""; //Resultado da comparaçao
        
        PrimeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro no Inteiro" );
        segundoNumero = JOptionPane.showInputDialog("Digite o Primeiro no Inteiro" );
    
        // convertendo os strings em inteiros
        
        numero1 = Integer.parseInt(PrimeiroNumero);
        numero2 = Integer.parseInt(segundoNumero);
                
        if (numero1 == numero2)
            resultado = numero1 + " == " + numero2;                            
        if (numero1 < numero2)
            resultado = numero1 + "\n" + numero1 + ">" + numero2;
        if (numero1 > numero2)
            resultado = numero1 + "\n" + numero1 + "<="+ numero2;
        if (numero1 <= numero2)
            resultado = numero1 + "\n" + numero1 + "=>"+ numero2;    
        if (numero1 >= numero2)
            resultado = numero1 + "\n" + numero1 + ">" + numero2;
        
        JOptionPane.showMessageDialog(null, "A soma é "+resultado," da Soma: ",
        JOptionPane.INFORMATION_MESSAGE );
        
        System.exit(0);
    }
}
