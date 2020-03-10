package Default;

import javax.swing.JOptionPane;

public class RegistroUsuario {

    public static void main(String[] args) {
        
        // variavel valor inteiro
    	String Nome;
    	String idade;
    	int idadeNova;
    	int soma;
    	
        Nome = JOptionPane.showInputDialog("Digite seu Nome Completo");
        idade = JOptionPane.showInputDialog("Digite sua idade atual");
        
        JOptionPane.showMessageDialog (null, "Nome:"+Nome, "Informacoes do Usuario ",
        JOptionPane.PLAIN_MESSAGE); 
                    
        // Adicionando valor a variavel idade
        idadeNova = Integer.parseInt(idade);
        
        soma = idadeNova + 10 ;

        JOptionPane.showMessageDialog(null, "Idade após 10 anos: "+soma, "Informacoes do Usuario ",
        JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
                    
    }
}

