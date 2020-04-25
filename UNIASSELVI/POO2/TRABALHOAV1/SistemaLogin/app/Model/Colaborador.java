package SistemaLogin.app.Model;

public class Colaborador extends UsuarioTipoFisico {
	private boolean verificacao;

  	public Colaborador() {
	  	super();
		this.verificacao = false;

    }
  	
 	public boolean LoginColaborador() { 		
 		System.out.println("########### Colaborador ########### ");
 		if (super.LoginBasico()){
 			if (super.getVinculoInstituicao() == true) {
 				System.out.println("Informe o CPF:");
 				String cpf = super.teclado.next();
 				if (cpf.equals(super.getCpf())) {
 					this.verificacao = true;
 				}
 			}
 		}
 		return this.verificacao;
 	}
 	
 	@Override
	public String toString() {
 		System.out.println("########### Colaborador ########### ");
	 	return super.toString() + "\n" +
	 			"--------- Dados de Colaborador ----------" + "\n" +
	    		"Registro de Colaborador: " + this.getRegistroInstituicao() + "\n";
	}

  
}
