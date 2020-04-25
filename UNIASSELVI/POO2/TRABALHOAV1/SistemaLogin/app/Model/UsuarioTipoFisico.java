package SistemaLogin.app.Model;

public class UsuarioTipoFisico extends Usuario {
	 protected String nome;
     protected String cpf;
     protected String naturalidade;
 	 protected int idade;

     public UsuarioTipoFisico() {
    	 super();
 	     this.nome = "";
    	 this.cpf = "";
    	 this.naturalidade = "";
 		 this.idade = 0;

     }

     public String getNome(){
 		 return this.nome;
 	 }
 	 public void setNome(String nome){
 	     this.nome = nome;
 	 }
 	
     public String getCpf() {
    	 return this.cpf;
     }
     public void setCpf(String cpf) {
    	 this.cpf = cpf;
     }
     
     public int getIdade(){
 	    return this.idade;
 	 }
 	 public void setIdade(int idade){
 	    this.idade = idade;
 	 }
     
 	 public String getNaturalidade(){
	     return this.naturalidade;
	 }
	 public void setNaturalidade(String naturalidade){
	     this.naturalidade = naturalidade;
	 }
	 
	 @Override
	 public String toString() {
		    return super.toString() + "\n" +
		    		"--------- Dados de Usuario Fisico ----------" + "\n" +
		    		"Nome: " + this.nome + "\n" +
		    		"Idade: " + this.idade + "\n" +
		    		"CPF: " + this.cpf + "\n" +
		    		"Naturalidade: " + this.naturalidade;
	 }
}
