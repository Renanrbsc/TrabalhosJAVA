package SistemaLogin.app.Model;

import java.util.Scanner;

public class Usuario {
	protected Scanner teclado;
	protected String registroInstituicao;
	protected String senha;
	protected boolean vinculoInstituicao;
	private boolean verificacao;
   
	public Usuario() {
		this.teclado = new Scanner(System.in);
		this.registroInstituicao = "";
	    this.senha = "";
		this.vinculoInstituicao = false;
		this.verificacao = false;
    }

	public String getRegistroInstituicao(){
 	    return this.registroInstituicao;
 	}
 	public void setRegistroInstituicao(String registroInstituicao){
 	    this.registroInstituicao = registroInstituicao;
 	}
 	
	public String getSenha(){
		return this.senha;
	}
	public void setSenha(String senha){
	    this.senha = senha;
	}
	
	public boolean getVinculoInstituicao(){
	    return this.vinculoInstituicao;
	}
	public void setVinculoInstituicao(boolean vinculoInstituicao){
	    this.vinculoInstituicao = vinculoInstituicao;
	}
	
	public boolean LoginBasico(){

		System.out.println("Informe o Usuario:");
		String registro = this.teclado.next();
		System.out.println("Informe a Senha:");
		String senha = this.teclado.next();
		
		if (registro.equals(this.getRegistroInstituicao())) {
			if (senha.equals(this.getSenha())) {
				this.verificacao =  true;
	 			System.out.println("Usuario e senha correto!");

			}
		}
		return this.verificacao;
	 }
	
	@Override
	public String toString() {
	    return 	"--------- Dados de Usuario ----------" + "\n" +
	    		"Registro de Login: " + this.registroInstituicao + "\n" +
	    		"Vinculo Instituicao: " + this.vinculoInstituicao;
	}

}




