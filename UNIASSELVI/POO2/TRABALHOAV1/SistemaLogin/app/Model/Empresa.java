package SistemaLogin.app.Model;

public class Empresa extends UsuarioTipoJuridico {
	private boolean verificacao;

	public Empresa() {
		super();
		this.verificacao = false;
    }
     
 	public boolean LoginEmpresa() {
 		System.out.println("########### Empresa ########### ");
 		if (super.LoginBasico()){
 			if (super.getVinculoInstituicao() == true) {
 				System.out.println("Informe o CNPJ:");
 				String cnpj = super.teclado.next();
 				if (cnpj.equals(super.getCnpj())) {
 					this.verificacao = true;
 				}
 			}
 		}
 		return this.verificacao;
 	}
  	
 	@Override
	public String toString() {
 		System.out.println("########### Empresa ########### ");
	    return super.toString() + "\n" +
	    		"--------- Dados da Empresa ----------" + "\n" +
	    		"Registro Empresa: " + this.getRegistroInstituicao() + "\n";
	    
	}

	
}
