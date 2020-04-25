package SistemaLogin.app.Model;

public class Comunidade extends UsuarioTipoFisico {
	private String vinculoAluno;
	private boolean verificacao;

  	public Comunidade() {
	  	super();
	  	this.vinculoAluno = "";
		this.verificacao = false;
  	}
  	
  	public String getVinculoAluno(){
 	    return this.vinculoAluno;
 	}
 	public void setVinculoAluno(String vinculoAluno){
 	    this.vinculoAluno = vinculoAluno;
 	}
 	
 	public boolean LoginComunidade() {
 		System.out.println("########### Comunidade ########### ");
 		System.out.println(super.getRegistroInstituicao());
 		if (super.LoginBasico()){
 			if (super.getVinculoInstituicao() == false) {
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
 		System.out.println("########### Comunidade ########### ");
	    return super.toString() + "\n" +	
	    		"--------- Dados de Comunidade ----------" + "\n" +
	    		"Vinculo Aluno: " + this.vinculoAluno + "\n";
 	}
 	
}
