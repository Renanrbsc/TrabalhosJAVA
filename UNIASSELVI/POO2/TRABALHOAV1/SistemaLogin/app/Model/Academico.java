package SistemaLogin.app.Model;

public class Academico extends UsuarioTipoFisico {
	private boolean verificacao;

	public Academico() {
		super();
		this.verificacao = false;
    }
 	
	public boolean LoginAcademico() {	
 		System.out.println("########### Academico ########### ");
 		if (super.LoginBasico()){
 			if (super.getVinculoInstituicao() != true) {
 				System.out.println("Informe o CPF:");
 				String cpf = super.teclado.next();
 				if (cpf == super.getCpf()) {
 					this.verificacao = true;
 				}
 			}else {
 				this.verificacao = true;
 			}
 		}
 		return this.verificacao;
 	}
 	
 	@Override
	public String toString() {
 		System.out.println("########### Academico ########### ");
	    return super.toString() + "\n" +
	    		"--------- Dados do Academico ----------" + "\n" +
	    		"Registro do Academico: " + this.getRegistroInstituicao() + "\n";
	}
     
}
