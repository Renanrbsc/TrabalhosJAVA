public class Pessoa {
    int id;
	String nome;
	int idade;
	String naturalidade;

	public Pessoa(){
		this.nome = "";
		this.idade = 0;
	}
	
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

	public String getNome(){
		return this.nome;
	}
    public void setNome(String nome){
        this.nome = nome;
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
        return "Id: " + this.id + "\n" +
               "Nome: " + this.nome + "\n" +
               "Idade: " + this.idade + "\n" +
               "Naturalidade: " + this.naturalidade + "\n";
    }






}
