package SistemaLogin.app.Model;

public class UsuarioTipoJuridico extends Usuario {
	protected String razaoSocial;
	protected String cnpj;
  
	public UsuarioTipoJuridico() {
		super();
		this.razaoSocial = "";
		this.cnpj = "";
	}
	
	public String getRazaoSocial(){
		 return this.razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial){
	     this.razaoSocial = razaoSocial;
	}
	 
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
 
	@Override
	public String toString() {
	    return super.toString() + "\n" +
	    		"--------- Dados de Usuario Juridico ----------" + "\n" +
	    		"Razão Social: " + this.razaoSocial + "\n" +
	    		"CNPJ: " + this.cnpj;
	}
}
